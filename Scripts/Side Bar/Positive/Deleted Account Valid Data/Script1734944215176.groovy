import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication(GlobalVariable.apkName, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Side Bar/Delete Account/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/Side Bar/Delete Account/android.widget.TextView - Delete Account'), 0)

Mobile.tap(findTestObject('Object Repository/Side Bar/Delete Account/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Object Repository/Side Bar/Delete Account/android.widget.EditText (1)'), GlobalVariable.newEmailaddresss, 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Side Bar/Delete Account/android.widget.TextView - Delete Account (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Side Bar/Delete Account/android.widget.TextView - Delete Account (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Side Bar/Delete Account/android.widget.TextView - Confirm'), 0)

