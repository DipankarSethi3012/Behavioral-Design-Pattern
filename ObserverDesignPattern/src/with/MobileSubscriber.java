package with;

//concrete observer
public class MobileSubscriber implements Subscribers{
    private String userName;

    MobileSubscriber(String userName) {
        this.userName = userName;
    }
    @Override
    public void update(String videoTitle) {
        System.out.println("Sending mobile App Notification to: " + userName + " for :" + videoTitle);
    }
}
