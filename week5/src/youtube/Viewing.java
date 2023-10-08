package youtube;

import youtube.ViewingStates.PlayingState;
import youtube.ViewingStates.ViewingState;

public class Viewing {
    private User user;
    private ViewingState state = new PlayingState(this);

    private Video currVideo;
    private Video nextVideo;

    public Viewing(User user, Video curr, Video next) {
        this.user = user;
        this.currVideo = curr;
        this.nextVideo = next;
    }

    public void showCurrVid() {
        System.out.println("now playing " + currVideo.getTitle());
    }

    public void setState(ViewingState state) {
        this.state = state;
    }

    public void toNextVid() {
        currVideo = nextVideo;
    }

    public void lock() {
        state.onLock();
    }

    public void play() {
        state.onPlay();
    }

    public void next() {
        state.onNext();
    }

    public static void main(String[] args) {
        Producer ashesh = new Producer("ashesh");
        User sai = new User("sai");
        Video vid1 = ashesh.postVideo("top 10 design patterns!! (not clickbait)", 100);
        Video vid2 = ashesh.postVideo("2511 assignment speedrun any % (WR 30s)", 30);
        
        Viewing v = new Viewing(sai, vid1, vid2);
        v.showCurrVid();
        v.play();
        v.play();
        v.lock();
        v.next();
        v.lock();
        v.next();
        v.showCurrVid();
    }
}
