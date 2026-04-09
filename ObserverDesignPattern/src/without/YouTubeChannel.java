package without;

public class YouTubeChannel {
    private String name;
    YouTubeChannel (String name) {
        this.name = name;
    }

    public void uploadNewVideo(String videoTitle) {
        System.out.println("Uplaoding the new video: " + videoTitle);

        //Manually notifying the users , (mostly loop through all the users)
        System.out.println("Sending email to: user@example.com");
        System.out.println("Pushing in-app notification to user@example.com");
        // ;
    }
}

//In this approach there's tight coupling. (later what is we added what's app notification) -> we have to modify this code
//SRP Violation: One class handles three things
//Less Scalable
