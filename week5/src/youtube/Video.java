package youtube;

public class Video {
    private String title;
    private int duration;
    private Producer producer;

    public Video(String title, int duration, Producer producer) {
        this.title = title;
        this.duration = duration;
        this.producer = producer;
    }

    public String getTitle() {
        return title;
    }

    public String getProducer() {
        return producer.getName();
    }
}


