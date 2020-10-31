package youtube.clients;

import youtube.models.Comment;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static youtube.clients.ChannelClient.getRandomChannel;
import static youtube.clients.ReplyClient.getAllRepliesByCommentId;

public class CommentClient {
    private static final Random random = new Random();

    public static List<Comment> getAllCommentsByVideoId(long id) {
        long commentId;
        return Arrays.asList(
                new Comment(id, commentId = Math.abs(random.nextLong()), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), getAllRepliesByCommentId(commentId)),
                new Comment(id, commentId = Math.abs(random.nextLong()), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), getAllRepliesByCommentId(commentId)),
                new Comment(id, commentId = Math.abs(random.nextLong()), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), getAllRepliesByCommentId(commentId)),
                new Comment(id, commentId = Math.abs(random.nextLong()), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), getAllRepliesByCommentId(commentId)),
                new Comment(id, commentId = Math.abs(random.nextLong()), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), getAllRepliesByCommentId(commentId)),
                new Comment(id, commentId = Math.abs(random.nextLong()), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), getAllRepliesByCommentId(commentId)),
                new Comment(id, commentId = Math.abs(random.nextLong()), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), getAllRepliesByCommentId(commentId)),
                new Comment(id, commentId = Math.abs(random.nextLong()), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), getAllRepliesByCommentId(commentId)),
                new Comment(id, commentId = Math.abs(random.nextLong()), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), getAllRepliesByCommentId(commentId)),
                new Comment(id, commentId = Math.abs(random.nextLong()), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), getAllRepliesByCommentId(commentId)),
                new Comment(id, commentId = Math.abs(random.nextLong()), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), getAllRepliesByCommentId(commentId)),
                new Comment(id, commentId = Math.abs(random.nextLong()), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), getAllRepliesByCommentId(commentId)),
                new Comment(id, commentId = Math.abs(random.nextLong()), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), getAllRepliesByCommentId(commentId)),
                new Comment(id, commentId = Math.abs(random.nextLong()), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), getAllRepliesByCommentId(commentId)),
                new Comment(id, commentId = Math.abs(random.nextLong()), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), getAllRepliesByCommentId(commentId)),
                new Comment(id, commentId = Math.abs(random.nextLong()), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), getAllRepliesByCommentId(commentId)),
                new Comment(id, commentId = Math.abs(random.nextLong()), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), getAllRepliesByCommentId(commentId)),
                new Comment(id, commentId = Math.abs(random.nextLong()), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), getAllRepliesByCommentId(commentId))
        );
    }
}
