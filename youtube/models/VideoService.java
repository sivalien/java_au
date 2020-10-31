package youtube.models;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VideoService {
    public static List<String> getTopVideoByReplies (List<Video> videoList, int n) {
        return videoList.stream()
                .flatMap(video -> video.getComments().stream())
                .sorted(Comparator.comparingInt(comment -> comment.getReplies().size()))
                .limit(n)
                .map(comment -> String.join(" ", String.valueOf(comment.getVideoId()), String.valueOf(comment.getReplies().size())))
                .collect(Collectors.toList());
    }

    public static List<String> getTopVideoByDislikes (List<Video> videoList, int n, long viewLimit) {
        return videoList.stream()
                .filter(video -> video.getViews() > viewLimit)
                .sorted(Comparator.comparingLong(Video::getDislikes).reversed())
                .limit(n)
                .map(video -> (String.join(" ", String.valueOf(video.getVideoId()), String.valueOf(video.getDislikes()))))
                .collect(Collectors.toList());
    }

    public static List<String> getTopVideoByCommentDislikes (List<Video> videoList, int n) {
        return videoList.stream()
                .flatMap(video -> video.getComments().stream())
                .sorted(Comparator.comparingLong(Comment::getDislikes).reversed())
                .limit(n)
                .map(comment -> String.join(" ", String.valueOf(comment.getVideoId()), String.valueOf(comment.getDislikes())))
                .collect(Collectors.toList());
    }
}
