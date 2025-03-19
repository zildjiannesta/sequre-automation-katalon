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

Mobile.startApplication(GlobalVariable.appFile, false)

//Mobile.startExistingApplication('id.sequre.pro')
Mobile.tap(findTestObject('Home/Guest User/android.view.View - Info tooltip button'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Home/Guest User/android.view.View - Open sidebar button'), 0)

GlobalVariable.actualVersion = Mobile.getText(findTestObject('Side Bar/android.widget.TextView - Apps version'), 3)

CustomKeywords.'customKeywords.verifyAppsVersion.verifyContains'(GlobalVariable.actualVersion, '1.0.1')

Mobile.tap(findTestObject('Side Bar/android.view.View - Cbange language drawer'), 0)

Mobile.tap(findTestObject('Side Bar/android.view.View - Cbange language drawer'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Side Bar/android.view.View - Change theme drawer'), 0)

Mobile.tap(findTestObject('Side Bar/android.view.View - Change theme drawer'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Home/Guest User/android.view.View - Close taskbar button'), 0)

Mobile.tap(findTestObject('Home/Guest User/android.view.View - Scan QR button'), 0)

Mobile.tap(findTestObject('Scan/Open Camera/android.view.View - Flash button'), 0)

Mobile.tap(findTestObject('Scan/Open Camera/android.view.View - Flash button'), 0)

Mobile.tap(findTestObject('Scan/Open Camera/android.widget.Button - Back button'), 0)

Mobile.delay(5)

