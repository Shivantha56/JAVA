import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class SendEmail
{
 public static void main(String [] args){
      String to = "         ";
      String from = "       ";
     String password = "    ";// Enter your gmail app Password

     //Get the session object
      Properties properties = System.getProperties();
      properties.put("mail.smtp.auth","true");
      properties.put("mail.smtp.starttls.enable","true");
      properties.put("mail.smtp.host","smtp.gmail.com");
      properties.put("mail.smtp.port","587");

     properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
     properties.setProperty("mail.smtp.socketFactory.fallback", "false");
     properties.setProperty("mail.smtp.port", "465");
     properties.setProperty("mail.smtp.socketFactory.port", "465");


      Session session = Session.getDefaultInstance(properties, new Authenticator() {
          @Override
          protected PasswordAuthentication getPasswordAuthentication() {
              return new PasswordAuthentication(from,password);
          }
      });

     //compose the message
      try{
         MimeMessage message = new MimeMessage(session);
         message.setFrom(new InternetAddress(from));
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
         message.setSubject("This is the test message");
         message.setText(" Hello This is the test message");

         // Send message
         Transport.send(message);
         System.out.println("message sent successfully....");

      }catch (MessagingException mex) {mex.printStackTrace();}
   }
}
