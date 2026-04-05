package without;

import java.util.ArrayList;
import java.util.List;

public class YoutubePlayList{
    private List<Video> playList = new ArrayList<>();

    public String addVideo(Video video) {
        playList.add(video);
        return video.getTitle();
    }

    public List<Video> getPlaylist() {
        return playList;
    }

}
