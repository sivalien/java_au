package shikimori.clients;

import shikimori.models.Comment;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CommentClient {
    private static final Random random = new Random();
    public static List<Comment> getAllCommentsByTitle(String title) {
         Comment comment1, comment2, comment3, comment4, comment5;
         return Arrays.asList(
                comment1 = new Comment(title, random.nextLong(), "Message" + random.nextInt(), random.nextBoolean()),
                comment2 = new Comment(title, random.nextLong(), "Message" + random.nextInt(), random.nextBoolean()),
                new Comment(title, random.nextLong(), "Message" + random.nextInt(), random.nextBoolean()),
                new Comment(title, random.nextLong(), "Message" + random.nextInt(), random.nextBoolean()),
                comment3 = new Comment(title, random.nextLong(), "Message" + random.nextInt(), random.nextBoolean()),
                new Comment(title, random.nextLong(), "Message" + random.nextInt(), random.nextBoolean()),
                new Comment(title, random.nextLong(), "Message" + random.nextInt(), random.nextBoolean()),
                new Comment(title, random.nextLong(), "Message" + random.nextInt(), random.nextBoolean()),
                new Comment(title, random.nextLong(), "Message" + random.nextInt(), random.nextBoolean()),
                comment4 = new Comment(random.nextLong(), "Message" + random.nextInt(), comment1),
                 new Comment(random.nextLong(), "Message" + random.nextInt(), comment1),
                comment5 = new Comment(random.nextLong(), "Message" + random.nextInt(), comment2),
                new Comment(random.nextLong(), "Message" + random.nextInt(), comment3),
                new Comment(random.nextLong(), "Message" + random.nextInt(), comment4),
                new Comment(random.nextLong(), "Message" + random.nextInt(), comment4),
                new Comment(random.nextLong(), "Message" + random.nextInt(), comment5)
        );
    }
}
