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

<<<<<<< HEAD
String appPackage = 'id.sequre.pro'
String playStoreURL = 'https://play.google.com/store/apps/details?id=' + appPackage
=======
Mobile.startExistingApplication(GlobalVariable.apkName, FailureHandling.STOP_ON_FAILURE)
>>>>>>> b9a0d7eb6ec96ef198b011c5098dcd4d80e1a827

// Check instalasi aplikasi

Process process = Runtime.getRuntime().exec('adb shell pm list packages ' + appPackage)

BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))

<<<<<<< HEAD
String line

boolean isInstalled = false
=======
not_run: GlobalVariable.actualVersion = Mobile.getText(findTestObject('Home/Guest User/Apps Version'), 0)

not_run: CustomKeywords.'customKeywords.verifyAppsVersion.verifyContains'(GlobalVariable.actualVersion, GlobalVariable.expectedVersion)
>>>>>>> b9a0d7eb6ec96ef198b011c5098dcd4d80e1a827

while ((line = reader.readLine()) != null) {
	
    if (line.contains(appPackage)) {
		
        isInstalled = true

        break
    }
}

if (isInstalled) {
	
    Mobile.startExistingApplication(appPackage)
	
} else {
	
    Mobile.comment('Aplikasi tidak ditemukan, membuka Play Store...')

<<<<<<< HEAD
    Runtime.getRuntime().exec('adb shell am start -a android.intent.action.VIEW -d ' + playStoreURL)
}
=======
WebUI.callTestCase(findTestCase('Side Bar/Positive/Change language and theme'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Side Bar/Change theme drawer'), 0)
>>>>>>> b9a0d7eb6ec96ef198b011c5098dcd4d80e1a827

//           | | |
// Test Case | | |
//           v v v

// Allow video/camera permission

<<<<<<< HEAD
if (Mobile.verifyElementExist(findTestObject(''), 0)) {
	
	Mobile.tap(findTestObject(''), 0)
	
} else {
	
	Mobile.tap(findTestObject(''), 0)
	
}
=======
not_run: Mobile.tap(findTestObject('Home/Guest User/Close taskbar button'), 0)

Mobile.pressBack()
>>>>>>> b9a0d7eb6ec96ef198b011c5098dcd4d80e1a827

// Allow location permission

if (Mobile.verifyElementExist(findTestObject(''), 0)) {
	
	Mobile.tap(findTestObject(''), 0)
	
} else {
	
	Mobile.tap(findTestObject(''), 0)
	
}

// Verify guest user?

if (Mobile.verifyElementExist('Home/Guest User/txt_please login', 3)) {
	
    Mobile.comment('Teks ditemukan, menjalankan Test Case Tanpa Logout')

} else {
	
    Mobile.comment('Teks tidak ditemukan, menjalankan Test Case Logout')

    Mobile.callTestCase(findTestCase('Test Cases/Logout'), [:])
}

Mobile.tap(findTestObject('Home/Guest User/btn_open sidebar'), 0)



