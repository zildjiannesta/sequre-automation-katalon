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
Mobile.tap(findTestObject('Home/Guest User/Info tooltip button'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Home/Guest User/Open sidebar button'), 0)

GlobalVariable.actualVersion = Mobile.getText(findTestObject('Side Bar/Apps version'), 3)

CustomKeywords.'customKeywords.verifyAppsVersion.verifyContains'(GlobalVariable.actualVersion, GlobalVariable.expectedVersion)

Mobile.tap(findTestObject('Side Bar/Change language drawer'), 0)

Mobile.tap(findTestObject('Side Bar/Change language drawer'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Side Bar/Change theme drawer'), 0)

Mobile.tap(findTestObject('Side Bar/Change theme drawer'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Home/Guest User/Close taskbar button'), 0)

Mobile.tap(findTestObject('Home/Guest User/Scan QR button'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Scan/Open Camera/Flash button'), 0)

Mobile.tap(findTestObject('Scan/Open Camera/Flash button'), 0)

Mobile.tap(findTestObject('Scan/Open Camera/Back button'), 0)

Mobile.delay(5)

