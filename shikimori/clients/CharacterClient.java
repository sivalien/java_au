package shikimori.clients;

import shikimori.models.MainCharacter;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static shikimori.clients.CharacterCommentClient.getAllCommentsByCharacter;

public class CharacterClient {
    private static final Random random = new Random();

    public static List<MainCharacter> getAllCharactersByTitle(String title) {
        long id;
        return Arrays.asList(
                new MainCharacter(id = Math.abs(random.nextLong()), getAllCommentsByCharacter(id), title),
                new MainCharacter(id = Math.abs(random.nextLong()), getAllCommentsByCharacter(id), title),
                new MainCharacter(id = Math.abs(random.nextLong()), getAllCommentsByCharacter(id), title),
                new MainCharacter(id = Math.abs(random.nextLong()), getAllCommentsByCharacter(id), title),
                new MainCharacter(id = Math.abs(random.nextLong()), getAllCommentsByCharacter(id), title),
                new MainCharacter(id = Math.abs(random.nextLong()), getAllCommentsByCharacter(id), title)

        );
    }
}
