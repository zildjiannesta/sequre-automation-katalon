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

Mobile.startExistingApplication(GlobalVariable.apkName, FailureHandling.STOP_ON_FAILURE)
//Mobile.startApplication(GlobalVariable.appFile, false)

Mobile.waitForElementPresent(findTestObject('Home/Guest User/Register button'), 0)

Mobile.tap(findTestObject('Home/Guest User/Register button'), 0)

Mobile.setText(findTestObject('Authentication/Register/Full name field'), GlobalVariable.fullName, 0)

Mobile.setText(findTestObject('Authentication/Register/Phone number field'), GlobalVariable.numberPhone, 0)

Mobile.setText(findTestObject('Authentication/Register/Email field'), GlobalVariable.emailAddress, 0)

Mobile.setText(findTestObject('Authentication/Register/Password field'), GlobalVariable.accountPassword, 0)

Mobile.setText(findTestObject('Authentication/Register/Confirm password field'), GlobalVariable.confirmPassword, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Authentication/Register/Terms and Conditions'), 0)

Mobile.tap(findTestObject('Authentication/Register/Agree to terms button'), 0)

Mobile.waitForElementPresent(findTestObject('Authentication/Register/Register button'), 0)

Mobile.tap(findTestObject('Authentication/Register/Register button'), 0)

Mobile.tap(findTestObject('Authentication/Input OTP/OTP field'), 0)

boolean isOTPEntered = false
TestObject submitButton = findTestObject('Authentication/Input OTP/Verify OTP button')

while (!isOTPEntered) {
	
	boolean isEnabled = Mobile.verifyElementAttributeValue(submitButton, 'enabled', 'true', 0, FailureHandling.OPTIONAL	)
	
	if (isEnabled) {
		isOTPEntered = true
		Mobile.comment("OTP telah diisi, melanjutkan proses..")
	} else {
		Mobile.comment("Menunggu pengguna mengisi OTP...")
	}
}

Mobile.tap(findTestObject('Authentication/Input OTP/Verify OTP button'), 0)

