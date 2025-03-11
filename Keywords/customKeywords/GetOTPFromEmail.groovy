package customKeywords
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.mail.*
import javax.mail.internet.MimeMultipart
import java.util.Properties
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
import internal.GlobalVariable as GlobalVariable

public class GetOTPFromEmail {
	@Keyword
	def static String getOTP(String email, String password) {
		String host = "imap.gmail.com"
		String otp = ""

		Properties properties = new Properties()
		properties.setProperty("mail.store.protocol", "imaps")
		properties.setProperty("mail.imap.ssl.enable", "true")
		properties.setProperty("mail.imap.port", "993")

		Session session = Session.getDefaultInstance(properties, null)
		Store store = session.getStore("imaps")
		store.connect(host, email, password)

		Folder inbox = store.getFolder("INBOX")
		inbox.open(Folder.READ_ONLY)

		Message[] messages = inbox.getMessages()

		for (int i = messages.length - 1; i >= 0; i--) {
			Message message = messages[i]
			String subject = message.getSubject()
			println("Subject Email: " + subject)

			if (subject.contains("Sign Up - SeQure OTP Confirmation")) {
				String content = getTextFromMessage(message)
				otp = content.find(/\d{4}/)
				break
			}
		}

		inbox.close(false)
		store.close()

		return otp
	}

	private static String getTextFromMessage(Message message) throws Exception {
		if (message.getContent() instanceof String) {
			return message.getContent()
		} else if (message.getContent() instanceof MimeMultipart) {
			MimeMultipart mimeMultipart = (MimeMultipart) message.getContent()
			return mimeMultipart.getBodyPart(0).getContent().toString()
		}
		return ""
	}
}
