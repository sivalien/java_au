package shikimori.models;

import java.util.List;

public class MainCharacter {
    private final long characterId;
    private final List<CharacterComment> characterComments;
    private final String animeTitle;

    public MainCharacter(long characterId, List<CharacterComment> characterComments, String animeTitle) {
        this.characterId = characterId;
        this.characterComments = characterComments;
        this.animeTitle = animeTitle;
    }

    public long getCharacterId() {
        return characterId;
    }

    public String getAnimeTitle() {
        return animeTitle;
    }

    public List<CharacterComment> getCharacterComments() {
        return characterComments;
    }
}
