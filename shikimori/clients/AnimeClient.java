package shikimori.clients;

import shikimori.Type;
import shikimori.models.Anime;

import java.util.*;

import static shikimori.clients.CharacterClient.getAllCharactersByTitle;
import static shikimori.clients.CommentClient.getAllCommentsByTitle;
import static shikimori.clients.GenresClient.getAllGenres;

public class AnimeClient {
    private static final Random random = new Random();

    public static List<Anime> getAllAnime() {
        String title;
        return Arrays.asList(
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title)),
                new Anime( title = "Title" + random.nextInt(), random.nextFloat() + random.nextInt(8) + 1, getAllGenres(), Type.values()[random.nextInt(4)], getAllCommentsByTitle(title), getAllCharactersByTitle(title))
        );

    }
}
