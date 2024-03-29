package exercise14;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class ServiceLayer {
	
	DataAccessLayer dal = new DataAccessLayer();
	
	public void someBusinessOperation() {
		if(checkSomeBusinessRule()) {
			dal.storeDataInDB();
		}else {
			try {
				Properties prop = new Properties();
				prop.put("mail.smtp.auth", true);
				prop.put("mail.smtp.starttls.enable", "true");
				prop.put("mail.smtp.host", "smtp.mailtrap.io");
				prop.put("mail.smtp.port", "25");
				prop.put("mail.smtp.ssl.trust", "smtp.mailtrap.io");
				Session session = Session.getInstance(prop, new Authenticator() {
				    @Override
				    protected PasswordAuthentication getPasswordAuthentication() {
				        return new PasswordAuthentication("username", "password");
				    }
				});
				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress("alertsystem@gmail.com"));
				message.setRecipients(
				  Message.RecipientType.TO, InternetAddress.parse("admin@gmail.com"));
				message.setSubject("Warning: May need your attention");

				String msg = "business rule 1 keeps failing for no apparent reason";

				MimeBodyPart mimeBodyPart = new MimeBodyPart();
				mimeBodyPart.setContent(msg, "text/html; charset=utf-8");

				Multipart multipart = new MimeMultipart();
				multipart.addBodyPart(mimeBodyPart);

				message.setContent(multipart);

				Transport.send(message);
			} catch (AddressException e1) {
				e1.printStackTrace();
			} catch (MessagingException e1) {
				e1.printStackTrace();
			}
		}
	}

	private boolean checkSomeBusinessRule() {
		//some actual logic here
		return false;
	}

}
