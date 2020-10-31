package shikimori.models;

/*
    There is no separate field for replies to comments,
    relies are mixed with the comments to anime
    in reply there is a link to comment which it refers to
    and also in the comment there are links to all this relies
 */

public class Comment {
    private final String animeTitle;
    private final long userId;
    private final String text;
    private final boolean isSummary;
    private final Comment replyTo;

    public Comment(String animeTitle, long userId, String text, boolean isSummary) {
        this.animeTitle = animeTitle;
        this.userId = userId;
        this.text = text;
        this.isSummary = isSummary;
        this.replyTo = null;
    }

    public Comment(long userId, String text, Comment replyTo) {
        this.animeTitle = replyTo.getAnimeTitle();
        this.userId = userId;
        this.text = text;
        this.isSummary = false;
        this.replyTo = replyTo;
    }

    public long getUserId() {
        return userId;
    }

    public boolean isSummary() {
        return isSummary;
    }

    public Comment getReplyTo() {
        return replyTo;
    }

    public String getText() {
        return text;
    }

    public String getAnimeTitle() {
        return animeTitle;
    }
}
