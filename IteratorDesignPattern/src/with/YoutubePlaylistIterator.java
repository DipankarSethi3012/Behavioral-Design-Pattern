package with;

import java.util.List;

public class YoutubePlaylistIterator implements PlayListIterator{
    private List<Video> videoList;
    private int pos;

    YoutubePlaylistIterator (List<Video> videoList) {
        this.videoList = videoList;
        this.pos = 0;
    }
    @Override
    public boolean hasNext() {
        return pos < videoList.size();
    }

    @Override
    public Video next() {
        return  hasNext() ? videoList.get(pos++) : null;
    }
}
