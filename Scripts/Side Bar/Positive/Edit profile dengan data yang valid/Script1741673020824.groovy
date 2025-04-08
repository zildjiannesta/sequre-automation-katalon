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

Mobile.tap(findTestObject('Side Bar/Edit Profile/Edit profile button'), 0)

Mobile.tap(findTestObject('Side Bar/Edit Profile/Edit profile button'), 0)

if (Mobile.verifyElementExist(findTestObject('Side Bar/Edit Profile/Pick Image On Gallery - android 15'), 0, FailureHandling.OPTIONAL)) {
	
	Mobile.tap(findTestObject('Side Bar/Edit Profile/Pick Image On Gallery - android 15'), 0)

} else {
	
	Mobile.tap(findTestObject('Side Bar/Edit Profile/Pick Image On Gallery - Android 11'), 0, FailureHandling.OPTIONAL)
	
}

Mobile.waitForElementPresent(findTestObject('Side Bar/Edit Profile/Field Username'), 0)

Mobile.setText(findTestObject('Side Bar/Edit Profile/Field Username'), GlobalVariable.newFullname, 0)

Mobile.setText(findTestObject('Side Bar/Edit Profile/Field Email Address'), GlobalVariable.newEmailaddresss, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Side Bar/Edit Profile/Save profile change button'), 0)

Mobile.tap(findTestObject('Side Bar/Edit Profile/Okay - Profile Success Updated'), 0)