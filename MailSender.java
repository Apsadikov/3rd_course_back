import java.util.Properties;

public class MailSender {
    private static JavaMailSender instance;

    private MailSender() {

    }

    public static synchronized JavaMailSender getInstance() {
        if (instance == null) {
            instance = new JavaMailSenderImpl();

            instance.setHost("smtp.gmail.com");
            instance.setPort(465);
            instance.setUsername("idzhalil@gmail.com");
            instance.setPassword("lqbopdospipviqzk");

            Properties props = instance.getJavaMailProperties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.ssl.enable", "true");
            props.put("mail.debug", "true");
        }
        return instance;
    }
}
