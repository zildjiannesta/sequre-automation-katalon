package customKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.exception.StepFailedException

public class verifyAppsVersion {

	@Keyword
	def verifyContains(String actualVersion, String expectedVersion) {

		KeywordUtil.logInfo("🔍 Verifying application version...")

		if (!actualVersion.contains(expectedVersion)) {

			String errorMessage = "❌ Version application doesn't match! Actual: ${actualVersion} | Expected: Sequre Ver ${expectedVersion}"

			KeywordUtil.logInfo(errorMessage)

			throw new StepFailedException(errorMessage)
		} else {

			KeywordUtil.logInfo("✔ Version matches: ${actualVersion}")
		}
	}
}
