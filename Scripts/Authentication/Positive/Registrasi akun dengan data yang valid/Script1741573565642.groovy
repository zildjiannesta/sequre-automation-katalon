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

Mobile.tap(findTestObject('Object Repository/Authentication/Login/android.widget.TextView - Sign Up'), 0)

Mobile.setText(findTestObject('Object Repository/Authentication/Login/android.widget.EditText (3)'), GlobalVariable.fullName, 
    0)

Mobile.setText(findTestObject('Object Repository/Authentication/Login/android.widget.EditText (4)'), GlobalVariable.numberPhone, 
    0)

Mobile.setText(findTestObject('Object Repository/Authentication/Login/android.widget.EditText (5)'), GlobalVariable.emailAddress, 
    0)

Mobile.setText(findTestObject('Object Repository/Authentication/Sign Up/android.widget.EditText'), GlobalVariable.accountPassword, 
    0)

Mobile.setText(findTestObject('Object Repository/Authentication/Sign Up/android.widget.EditText (1)'), GlobalVariable.confirmPassword, 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Authentication/Sign Up/android.widget.TextView - Terms and Conditions (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Authentication/Sign Up/android.widget.TextView - Agree to Terms'), 0)

Mobile.tap(findTestObject('Object Repository/Authentication/Sign Up/android.widget.TextView - Register'), 0)

Mobile.delay(6)

Mobile.tap(findTestObject('Object Repository/Authentication/Sign Up/android.widget.EditText (2)'), 0)

Mobile.delay(30)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Authentication/Sign Up/android.widget.TextView - Next'), 0)



