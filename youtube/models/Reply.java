package youtube.models;

public class Reply {
    private final String reply;
    private final Channel channel;
    private final long likes;
    private final long dislikes;
    private final long commentId;


    public Reply(String reply, Channel channel, long likes, long dislikes, long commentId) {
        this.reply = reply;
        this.channel = channel;
        this.likes = likes;
        this.dislikes = dislikes;
        this.commentId = commentId;
    }

    public String getReply() {
        return reply;
    }

    public Channel getChannel() {
        return channel;
    }

    public long getLikes() {
        return likes;
    }

    public long getDislikes() {
        return dislikes;
    }

    public long getCommentId() {
        return commentId;
    }
}
