package youtube.clients;

import youtube.models.Video;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static youtube.clients.ChannelClient.getRandomChannel;
import static youtube.clients.CommentClient.getAllCommentsByVideoId;

public class VideoClient {
    private static final Random random = new Random();

    public static List<Video> getAllVideo() {
        long videoId;
        return Arrays.asList(
                new Video(videoId = Math.abs(random.nextLong()), Math.abs(random.nextLong()),Math.abs(random.nextLong()),Math.abs(random.nextLong()), getRandomChannel(), getAllCommentsByVideoId(videoId)),
                new Video(videoId = Math.abs(random.nextLong()), Math.abs(random.nextLong()),Math.abs(random.nextLong()),Math.abs(random.nextLong()), getRandomChannel(), getAllCommentsByVideoId(videoId)),
                new Video(videoId = Math.abs(random.nextLong()), Math.abs(random.nextLong()),Math.abs(random.nextLong()),Math.abs(random.nextLong()), getRandomChannel(), getAllCommentsByVideoId(videoId)),
                new Video(videoId = Math.abs(random.nextLong()), Math.abs(random.nextLong()),Math.abs(random.nextLong()),Math.abs(random.nextLong()), getRandomChannel(), getAllCommentsByVideoId(videoId)),
                new Video(videoId = Math.abs(random.nextLong()), Math.abs(random.nextLong()),Math.abs(random.nextLong()),Math.abs(random.nextLong()), getRandomChannel(), getAllCommentsByVideoId(videoId)),
                new Video(videoId = Math.abs(random.nextLong()), Math.abs(random.nextLong()),Math.abs(random.nextLong()),Math.abs(random.nextLong()), getRandomChannel(), getAllCommentsByVideoId(videoId)),
                new Video(videoId = Math.abs(random.nextLong()), Math.abs(random.nextLong()),Math.abs(random.nextLong()),Math.abs(random.nextLong()), getRandomChannel(), getAllCommentsByVideoId(videoId)),
                new Video(videoId = Math.abs(random.nextLong()), Math.abs(random.nextLong()),Math.abs(random.nextLong()),Math.abs(random.nextLong()), getRandomChannel(), getAllCommentsByVideoId(videoId)),
                new Video(videoId = Math.abs(random.nextLong()), Math.abs(random.nextLong()),Math.abs(random.nextLong()),Math.abs(random.nextLong()), getRandomChannel(), getAllCommentsByVideoId(videoId)),
                new Video(videoId = Math.abs(random.nextLong()), Math.abs(random.nextLong()),Math.abs(random.nextLong()),Math.abs(random.nextLong()), getRandomChannel(), getAllCommentsByVideoId(videoId)),
                new Video(videoId = Math.abs(random.nextLong()), Math.abs(random.nextLong()),Math.abs(random.nextLong()),Math.abs(random.nextLong()), getRandomChannel(), getAllCommentsByVideoId(videoId)),
                new Video(videoId = Math.abs(random.nextLong()), Math.abs(random.nextLong()),Math.abs(random.nextLong()),Math.abs(random.nextLong()), getRandomChannel(), getAllCommentsByVideoId(videoId)),
                new Video(videoId = Math.abs(random.nextLong()), Math.abs(random.nextLong()),Math.abs(random.nextLong()),Math.abs(random.nextLong()), getRandomChannel(), getAllCommentsByVideoId(videoId)),
                new Video(videoId = Math.abs(random.nextLong()), Math.abs(random.nextLong()),Math.abs(random.nextLong()),Math.abs(random.nextLong()), getRandomChannel(), getAllCommentsByVideoId(videoId)),
                new Video(videoId = Math.abs(random.nextLong()), Math.abs(random.nextLong()),Math.abs(random.nextLong()),Math.abs(random.nextLong()), getRandomChannel(), getAllCommentsByVideoId(videoId)),
                new Video(videoId = Math.abs(random.nextLong()), Math.abs(random.nextLong()),Math.abs(random.nextLong()),Math.abs(random.nextLong()), getRandomChannel(), getAllCommentsByVideoId(videoId))
        );
    }
}
