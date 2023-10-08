package youtube;

import java.util.ArrayList;
import java.util.List;

public class Producer {
    private String username;
    private List<User> subscribers = new ArrayList<>();
    private List<Video> videos = new ArrayList<>();

    public Producer(String username) {
        this.username = username;
    }

    public String getName() {
        return username;
    }

    public void addSubscriber(User subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(User subscriber) {
        subscribers.remove(subscriber);
    }

    public Video postVideo(String title, int length) {
        Video vid = new Video(title, length, this);
        videos.add(vid);
        subscribers.forEach(x -> x.alert(vid));
        return vid;
    }

    public static void main(String[] args) {
        Producer ashesh = new Producer("ashesh");
        User nicole = new User("nicole");
        User sai = new User("sai");

        nicole.subscribeTo(ashesh);
        sai.subscribeTo(ashesh);
        ashesh.postVideo("top 10 design patterns!! (not clickbait)", 100);

        sai.unsubscribeTo(ashesh);
        ashesh.postVideo("2511 assignment speedrun any % (WR 30s)", 30);
    }
}

