package without;

public class Without {
    public static void main(String[] args) {
        Video video = new Video("Sage Pattern");
        Video video1 = new Video("BackPressure");

        YoutubePlayList youtubePlayList = new YoutubePlayList();

        youtubePlayList.addVideo(video);
        youtubePlayList.addVideo(video1);

        for(Video v : youtubePlayList.getPlaylist()) {
            System.out.println(v.getTitle());
        }
    }
}
//Encapsulation breaks
//The internal List (Data structure is directly exposed to the client using the getPlayList() method.
//This breaks encapsulation.
//Client can modify this by adding the new method

//Tightly coupling
//The internal Structure is Tightly Coupled
//If we change from the list to arrays or tree the code breaks;

//NO control over traversal
//The traversal logic is managed outside the class.
//we can't enforce the custom traversal behaviors (ex: traversal, skip elements, reversal) without modifying the client code

//Difficult to support multiple independent traversals
//If two parts of your program wants to iterate over the same playlist independently, there's no built-in way to do that cleanly
//We have to manage the indexing and traversal state manually