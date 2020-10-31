package youtube.models;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ChannelService {
    public static List<String> getTopChannelByCommentLikes (List<Video> videoList, int n) {
        return videoList.stream()
                .flatMap(video -> video.getComments().stream())
                .sorted(Comparator.comparingLong(Comment::getLikes).reversed())
                .limit(n)
                .map(comment -> String.join(" ", String.valueOf(comment.getChannel().getId()), String.valueOf(comment.getLikes())))
                .collect(Collectors.toList());
    }

    public static List<String> getTopChannelByRepliesLikes (List<Video> videoList, int n) {
        return videoList.stream()
                .flatMap(video -> video.getComments().stream())
                .flatMap(comment -> comment.getReplies().stream())
                .sorted(Comparator.comparingLong(Reply::getLikes).reversed())
                .limit(n)
                .map(reply -> String.join(" ", String.valueOf(reply.getChannel().getId()), String.valueOf(reply.getLikes())))
                .collect(Collectors.toList());
    }
}
