package shikimori;

import shikimori.models.Anime;

import java.util.List;

import static shikimori.clients.AnimeClient.getAllAnime;
import static shikimori.models.AnimeService.*;

public class Main {
    public static void main(String[] args) {
        List<Anime> animeList = getAllAnime();
        getTopTVSeriesBySummaries(animeList, 3).forEach(System.out::println);
        getTopDramaByScores(animeList, 5).forEach(System.out::println);
        getTopGenresByScore(animeList).forEach(System.out::println);
        getTopSpecialByReplies(animeList, 3).forEach(System.out::println);
        getTopActionByCharacterComments(animeList, 5).forEach(System.out::println);
    }
}
