package shikimori.clients;

import shikimori.Genre;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GenresClient {
    private static final Random random = new Random();

    public static Set<Genre> getAllGenres() {
        int len = random.nextInt(5) + 1;
        Set<Genre> genreSet = new HashSet<>();
        for (int i = 0; i < len; i++)
            genreSet.add(Genre.values()[random.nextInt(8)]);
        return genreSet;
    }
}
