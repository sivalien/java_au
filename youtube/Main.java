package youtube;

import youtube.models.Video;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static youtube.clients.VideoClient.getAllVideo;
import static youtube.models.ChannelService.*;
import static youtube.models.VideoService.*;

public class Main {
    public static void main(String[] args) {
        List<Video> videoList = getAllVideo();
        getTopVideoByReplies(videoList, 5).forEach(System.out::println);
        System.out.println("\n");
        getTopVideoByDislikes(videoList, 6, 1000).forEach(System.out::println);
        System.out.println("\n");
        getTopChannelByCommentLikes(videoList, 3).forEach(System.out::println);
        System.out.println("\n");
        getTopVideoByCommentDislikes(videoList, 3).forEach(System.out::println);
        System.out.println("\n");
        getTopChannelByRepliesLikes(videoList, 3).forEach(System.out::println);
    }
}
