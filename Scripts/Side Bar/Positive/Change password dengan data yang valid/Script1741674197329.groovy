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

Mobile.tap(findTestObject('Object Repository/Side Bar/Change password dengan data yang valid/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/Side Bar/Change password dengan data yang valid/android.widget.TextView - Change Password'), 
    0)

Mobile.tap(findTestObject('Object Repository/Side Bar/Change password dengan data yang valid/android.widget.EditText'), 
    0)

Mobile.setText(findTestObject('Object Repository/Side Bar/Change password dengan data yang valid/android.widget.EditText (1)'), 
    GlobalVariable.accountPassword, 0)

Mobile.tap(findTestObject('Object Repository/Side Bar/Change password dengan data yang valid/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Side Bar/Change password dengan data yang valid/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Side Bar/Change password dengan data yang valid/android.widget.EditText (2)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Side Bar/Change password dengan data yang valid/android.widget.EditText (3)'), 
    GlobalVariable.newAccpassword, 0)

Mobile.tap(findTestObject('Object Repository/Side Bar/Change password dengan data yang valid/android.view.View (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Side Bar/Change password dengan data yang valid/android.view.View (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Side Bar/Change password dengan data yang valid/android.widget.EditText (4)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Side Bar/Change password dengan data yang valid/android.widget.EditText (5)'), 
    GlobalVariable.newAccpassword, 0)

Mobile.tap(findTestObject('Object Repository/Side Bar/Change password dengan data yang valid/android.view.View (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Side Bar/Change password dengan data yang valid/android.view.View (3)'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Side Bar/Change password dengan data yang valid/android.widget.TextView - Save'), 
    0)

Mobile.tap(findTestObject('Object Repository/Side Bar/Change password dengan data yang valid/android.widget.TextView - Confirm'), 
    0)

Mobile.tap(findTestObject('Object Repository/Side Bar/Change password dengan data yang valid/android.widget.TextView - Okay (5)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Side Bar/Change password dengan data yang valid/android.view.View (4)'), 0)

