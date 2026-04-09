package with;

//concrete subscribers
public class EmailSubscriber implements Subscribers{
    private String email;

    EmailSubscriber(String email) {
        this.email = email;
    }
    @Override
    public void update(String videoTitle) {
        System.out.println("Sending email to: " + email + " for: " + videoTitle);
    }
}
