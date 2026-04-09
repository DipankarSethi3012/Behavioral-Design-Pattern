package with;

import without.YouTubeChannel;

public class With {
    public static void main(String[] args) {
       YoutubeChannel yt = new YoutubeChannel("infraWithDipankar");
       yt.subscribe(new EmailSubscriber("a"));
       yt.subscribe(new MobileSubscriber("b"));
       yt.notifySubscribers("xyz");
    }
}
