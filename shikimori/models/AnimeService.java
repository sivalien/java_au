package shikimori.models;;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static shikimori.Genre.ACTION;
import static shikimori.Genre.DRAMA;
import static shikimori.Type.TV_SERIES;
import static shikimori.Type.SRECIAL;

public class AnimeService {
    public static List<String> getTopTVSeriesBySummaries(List<Anime> animeList, int n) {
        return animeList.stream()
                .filter(anime -> anime.getType().equals(TV_SERIES))
                .map(anime -> anime.getCommentList().stream().filter(Comment::isSummary))
                .map(x -> x.collect(Collectors.toList()))
                .sorted((comments1, comments2) -> (comments1.size() < comments2.size() ? 1 : -1))
                .limit(n)
                .map(comments -> String.join(" ", comments.get(0).getAnimeTitle(), String.valueOf(comments.size())))
                .collect(Collectors.toList());
    }

    public static List<String> getTopDramaByScores(List<Anime> animeList, int n) {
        return animeList.stream()
                .filter(anime -> anime.getGenreSet().contains(DRAMA))
                .sorted(Comparator.comparingDouble(Anime::getScore).reversed())
                .limit(n)
                .map(anime -> String.join(" ", anime.getTitle(), String.valueOf(anime.getScore())))
                .collect(Collectors.toList());
    }

    public static Set<String> getTopGenresByScore(List<Anime> animeList) {
        return animeList.stream()
                .sorted(Comparator.comparingDouble(Anime::getScore).reversed())
                .flatMap(anime -> anime.getGenreSet().stream())
                .map(genre -> genre.toString())
                .collect(Collectors.toSet());
    }

    public static List<String> getTopSpecialByReplies(List<Anime> animeList, int n) {
        return animeList.stream()
                .filter(anime -> anime.getType().equals(SRECIAL))
                .map(anime -> anime.getCommentList().stream().filter(comment -> comment.getReplyTo() != null))
                .map(x -> x.collect(Collectors.toList()))
                .sorted((comments1, comments2) -> (comments1.size() < comments2.size() ? 1 : -1))
                .limit(n)
                .map(comments -> String.join(" ", comments.get(0).getAnimeTitle(), String.valueOf(comments.size())))
                .collect(Collectors.toList());
    }

    public static List<String> getTopActionByCharacterComments(List<Anime> animeList, int n) {
        return animeList.stream()
                .filter(anime -> anime.getGenreSet().contains(ACTION))
                .map(anime -> anime.getMainCharacters().stream())
                .map(x -> x.sorted(Comparator.comparingInt(character -> character.getCharacterComments().size())))
                .map(x -> x.collect(Collectors.toList()).get(0))
                .sorted(Comparator.comparingInt(character -> character.getCharacterComments().size()))
                .limit(n)
                .map(character -> String.join(" ", character.getAnimeTitle(), String.valueOf(character.getCharacterComments().size())))
                .collect(Collectors.toList());
    }
}
