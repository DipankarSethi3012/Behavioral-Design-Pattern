package with;

import java.util.ArrayList;
import java.util.List;

public class YoutubePlayList implements PlayList{
    private String name;
    private List<Video> videoList;

    YoutubePlayList(String name) {
        videoList = new ArrayList<>();
        this.name = name;
    }

    public void addVideo(Video video) {
        videoList.add(video);
        System.out.println(video.getTitle() + " added to playlist " + name);
    }

    @Override
    public PlayListIterator getIterator() {
        return new YoutubePlaylistIterator(videoList);
    }
}
