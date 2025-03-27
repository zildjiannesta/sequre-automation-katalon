import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

String appPackage = 'id.sequre.pro'

String playStoreURL = 'https://play.google.com/store/apps/details?id=' + appPackage

// Check instalasi aplikasi
Process process = Runtime.getRuntime().exec('adb shell pm list packages ' + appPackage)

BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))

String line

boolean isInstalled = false

while ((line = reader.readLine()) != null) {
    if (line.contains(appPackage)) {
        isInstalled = true

        break
    }
}

if (isInstalled) {
    Mobile.startExistingApplication(appPackage) //    Mobile.comment('Aplikasi tidak ditemukan, membuka Play Store...')
    //
    //    Runtime.getRuntime().exec('adb shell am start -a android.intent.action.VIEW -d ' + playStoreURL)
} else {
    Mobile.startApplication(GlobalVariable.appFile, false)
}

//           | | |
// Test Case | | |
//           v v v
// Allow video/camera permission
if (Mobile.verifyElementExist(findTestObject('Apps Permission/allow_video_and15'), 1, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Apps Permission/allow_video_and15'), 0)
} else {
    KeywordUtil.markPassed('Element tidak ditemukan, melewati step ini')
}

// Allow location permission
if (Mobile.verifyElementExist(findTestObject('Apps Permission/allow_location_and15'), 1, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Apps Permission/allow_video_and15'), 0)
} else {
    KeywordUtil.markPassed('Element tidak ditemukan, melewati step ini')
}

// Verify guest user?
if (Mobile.verifyElementExist(findTestObject('Home/Guest User/txt_please login'), 1, FailureHandling.OPTIONAL)) {
    Mobile.comment('Teks ditemukan, menjalankan Test Case Tanpa Logout')
} else {
    Mobile.comment('Teks tidak ditemukan, menjalankan Test Case Logout')

    Mobile.callTestCase(findTestCase('Test Cases/Side Bar/Positive/Logout'), [:])
}

Mobile.startExistingApplication(GlobalVariable.apkName)

Mobile.tap(findTestObject('Home/Guest User/btn_show scanned info'), 0)

Mobile.waitForElementPresent(findTestObject('Home/Guest User/pop-up_tooltip scanned information'), 1, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Home/btn - openSidebar'), 0)

