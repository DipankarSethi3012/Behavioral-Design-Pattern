package with;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Channel {
    private List<Subscribers> li = new ArrayList<>();
    private String channelName;

    YoutubeChannel (String channelName) {
        this.channelName = channelName;
    }
    @Override
    public void subscribe(Subscribers subscribers) {
        li.add(subscribers);
    }

    @Override
    public void unSubscribe(Subscribers subscribers) {
        li.remove(subscribers);
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        for(Subscribers s : li) {
            s.update(videoTitle);
        }
    }
}
