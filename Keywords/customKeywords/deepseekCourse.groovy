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
import javax.mail.*
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage
import javax.mail.search.SubjectTerm

import internal.GlobalVariable

public class deepseekCourse {
	@Keyword
	def String getOTPFromGmail(String email, String password, String subjectKeyword) {
		Properties props = new Properties()
		props.setProperty("mail.store.protocol", "imaps")
		props.setProperty("mail.imaps.host", "imap.gmail.com")
		props.setProperty("mail.imaps.port", "993")
		props.setProperty("mail.imaps.ssl.enable", "true")

		Session session = Session.getInstance(props, null)
		Store store = session.getStore("imaps")
		store.connect("imap.gmail.com", email, password)

		Folder inbox = store.getFolder("INBOX")
		inbox.open(Folder.READ_ONLY)

		Message[] messages = inbox.search(new SubjectTerm(subjectKeyword), inbox.getMessages())

		String otp = ""
		if (messages.length > 0) {
			Message message = messages[messages.length - 1] // Ambil email terbaru
			String content = message.getContent().toString()
			otp = extractOTP(content) // Fungsi untuk mengekstrak OTP dari konten email
		}

		inbox.close(false)
		store.close()

		return otp
	}

	private String extractOTP(String content) {
		// Contoh sederhana untuk mengekstrak OTP 6 digit dari konten email
		return content.find(/\b\d{6}\b/)
	}
}
