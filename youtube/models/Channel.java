package youtube.models;

import java.util.List;

public class Channel {
    private final long id;
    private final long subscribers;
    private final long views;


    public Channel(long id, long subscribers, long views) {
        this.id = id;
        this.subscribers = subscribers;
        this.views = views;
    }

    public long getId() {
        return id;
    }

    public long getSubscribers() {
        return subscribers;
    }

    public long getViews() {
        return views;
    }
}
