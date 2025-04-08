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

Mobile.startExistingApplication('com.android.chrome')

Mobile.tap(findTestObject('Authentication/Register/OTP Register/btn - homeChrome'), 2, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Authentication/Register/OTP Register/txt - Telusuri atau ketik alamat web'), 
    0)

Mobile.clearText(findTestObject('Authentication/Register/OTP Register/txt - Detail Telusuri atau ketik alamat web'), 0)

Mobile.setText(findTestObject('Object Repository/Authentication/Register/OTP Register/txt - Detail Telusuri atau ketik alamat web'), 
    'yopmail.com', 0)

Mobile.tap(findTestObject('Object Repository/Authentication/Register/OTP Register/select - yopmail.com'), 0)

Mobile.clearText(findTestObject('Authentication/Register/OTP Register/txt - email login'), 0)

Mobile.setText(findTestObject('Object Repository/Authentication/Register/OTP Register/txt - email login'), GlobalVariable.emailAddress_2, 
    0)

Mobile.tap(findTestObject('Object Repository/Authentication/Register/OTP Register/btn - get email'), 0)

Mobile.tap(findTestObject('Object Repository/Authentication/Register/OTP Register/btn - list email'), 0)

GlobalVariable.otpCode = Mobile.getText(findTestObject('Object Repository/Authentication/Register/OTP Register/txt - OTP code'), 
    0)

println(GlobalVariable.otpCode)

Mobile.tap(findTestObject('Authentication/Register/OTP Register/btn - homeChrome'), 2, FailureHandling.OPTIONAL)

Mobile.closeApplication()

