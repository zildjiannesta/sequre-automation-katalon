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

Mobile.tap(findTestObject('Home/Guest User/android.view.View - Register button'), 0)

Mobile.setText(findTestObject('Authentication/Register/android.widget.EditText - Full name field'), GlobalVariable.fullName, 
    0)

Mobile.setText(findTestObject('Authentication/Register/android.widget.EditText - Phone number field'), GlobalVariable.numberPhone, 
    0)

Mobile.setText(findTestObject('Authentication/Register/android.widget.EditText - Email field'), GlobalVariable.emailAddress, 
    0)

Mobile.setText(findTestObject('Authentication/Register/android.widget.EditText - Password field'), GlobalVariable.accountPassword, 
    0)

Mobile.setText(findTestObject('Authentication/Register/android.widget.EditText - Confirm password field'), GlobalVariable.confirmPassword, 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Authentication/Register/android.widget.TextView - Terms and Conditions'), 0)

Mobile.tap(findTestObject('Authentication/Register/android.view.View - Agree to terms button'), 0)

Mobile.tap(findTestObject('Authentication/Register/android.view.View - Register button'), 0)

Mobile.delay(6)

Mobile.tap(findTestObject('Authentication/Input OTP/android.widget.EditText - OTP field'), 0)

Mobile.delay(30)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Authentication/Input OTP/android.view.View - Verify OTP button'), 0)

Mobile.delay(6)

