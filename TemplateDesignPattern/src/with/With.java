package with;

public class With {
    public static void main(String[] args) {
        NotificationSender email = new EmailNotification();
        email.send("abc@gamil.com", "Welcome to infra with dipankar");

        System.out.println("------");
        NotificationSender sms = new SMSNotification();
        sms.send("xyz@gmail.com", "welcome to infrawithDipankar");
    }
}
