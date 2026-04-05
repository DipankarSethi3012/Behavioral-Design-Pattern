package with;

public class With {
    public static void main(String[] args) {
        YoutubePlayList youtubePlayList = new YoutubePlayList("System Design");
        youtubePlayList.addVideo(new Video("v1"));
        youtubePlayList.addVideo(new Video("v2"));

       PlayListIterator iterator = youtubePlayList.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }
    }
}
