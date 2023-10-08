package youtube;

public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }
    public void alert(Video vid) {
        System.out.printf("%s: A new video %s was just posted from %s!\n", username, vid.getTitle(), vid.getProducer());
    }

    public void subscribeTo(Producer producer) {
        producer.addSubscriber(this);
    }

    public void unsubscribeTo(Producer producer) {
        producer.removeSubscriber(this);
    }
}

