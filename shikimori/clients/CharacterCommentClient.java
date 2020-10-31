package shikimori.clients;

import shikimori.models.CharacterComment;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CharacterCommentClient {
    private static final Random random = new Random();

    public static List<CharacterComment> getAllCommentsByCharacter(long id) {
        CharacterComment comment1, comment2, comment3, comment4;
        return Arrays.asList(
                comment1 = new CharacterComment(id, "Meassage" + random.nextInt(), null, Math.abs(random.nextLong())),
                comment2 = new CharacterComment(id, "Meassage" + random.nextInt(), null, Math.abs(random.nextLong())),
                comment3 = new CharacterComment(id, "Meassage" + random.nextInt(), null, Math.abs(random.nextLong())),
                comment4 = new CharacterComment(id, "Meassage" + random.nextInt(), null, Math.abs(random.nextLong())),
                new CharacterComment(id, "Meassage" + random.nextInt(), comment1, Math.abs(random.nextLong())),
                new CharacterComment(id, "Meassage" + random.nextInt(), comment2, Math.abs(random.nextLong())),
                new CharacterComment(id,"Meassage" + random.nextInt(), comment3, Math.abs(random.nextLong())),
                new CharacterComment(id, "Meassage" + random.nextInt(), comment3, Math.abs(random.nextLong())),
                new CharacterComment(id,"Meassage" + random.nextInt(), comment4, Math.abs(random.nextLong()))
        );
    }
}
