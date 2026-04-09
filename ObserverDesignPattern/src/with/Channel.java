package with;

import java.util.concurrent.Flow;

//Subject interface
public interface Channel {
    void subscribe(Subscribers subscribers);
    void unSubscribe(Subscribers subscribers);
    void notifySubscribers(String videoTitle);

}
