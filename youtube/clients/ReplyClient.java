package youtube.clients;

import youtube.models.Reply;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static youtube.clients.ChannelClient.getRandomChannel;

public class ReplyClient {
    private static final Random random = new Random();
    public static List<Reply> getAllRepliesByCommentId(long id) {
        return Arrays.asList(
                new Reply("Reply" + random.nextInt(), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), id),
                new Reply("Reply" + random.nextInt(), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), id),
                new Reply("Reply" + random.nextInt(), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), id),
                new Reply("Reply" + random.nextInt(), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), id),
                new Reply("Reply" + random.nextInt(), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), id),
                new Reply("Reply" + random.nextInt(), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), id),
                new Reply("Reply" + random.nextInt(), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), id),
                new Reply("Reply" + random.nextInt(), getRandomChannel(), Math.abs(random.nextLong()), Math.abs(random.nextLong()), id)
        );
    }
}
