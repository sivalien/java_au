package youtube.models;

import java.util.List;

public class Comment {
    private final long videoId;
    private final long id;
    private final Channel channel;
    private final long likes;
    private final long dislikes;
    private final List<Reply> replies;

    public Comment(long videoId, long id, Channel channel, long likes, long dislikes, List<Reply> replies) {
        this.videoId = videoId;
        this.id = id;
        this.channel = channel;
        this.likes = likes;
        this.dislikes = dislikes;
        this.replies = replies;
    }

    public long getLikes() {
        return likes;
    }

    public long getDislikes() {
        return dislikes;
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public Channel getChannel() {
        return channel;
    }

    public long getId() {
        return id;
    }

    public long getVideoId() {
        return videoId;
    }
}
