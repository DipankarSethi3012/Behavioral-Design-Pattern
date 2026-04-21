package without;

public class Without {
    public static void main(String[] args) {
        // Create objects for both notification services
        EmailNotification emailNotification = new EmailNotification();
        SMSNotification smsNotification = new SMSNotification();

        // Sending email notification
        emailNotification.send("example@example.com", "Your order has been placed!");

        System.out.println(" ");

        // Sending SMS notification
        smsNotification.send("1234567890", "Your OTP is 1234.");
    }
}
