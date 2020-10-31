package youtube.models;

import java.util.List;

public class Video {
    private final long videoId;
    private final long likes;
    private final long dislikes;
    private final long views;
    private final Channel channel;
    private final List<Comment> comments;


    public Video(long videoId, long likes, long dislikes, long views, Channel channel, List<Comment> comments) {
        this.videoId = videoId;
        this.likes = likes;
        this.dislikes = dislikes;
        this.views = views;
        this.channel = channel;
        this.comments = comments;
    }

    public long getVideoId() {
        return videoId;
    }

    public long getLikes() {
        return likes;
    }

    public long getDislikes() {
        return dislikes;
    }

    public long getViews() {
        return views;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public Channel getChannel() {
        return channel;
    }
    
}
