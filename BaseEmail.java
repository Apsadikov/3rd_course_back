public class BaseEmail {
    public void sendEmail(Mail mail) {
        MimeMessagePreparator preparator = mimeMessage -> {
            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(mail.getTo()));
            mimeMessage.setFrom(new InternetAddress("email@example.com"));
            mimeMessage.setSubject(mail.getSubject());
            mimeMessage.setText(mail.getBody());
        };

        try {
            MailSender.getInstance().send(preparator);
        } catch (MailException ex) {
            System.err.println(ex);
        }
    }
}
