package shikimori.models;

/*
Character comment can't be a summary
 */

public class CharacterComment {
    private final long characterId;
    private final String text;
    private final CharacterComment replyTo;
    private final long userId;

    public CharacterComment(long characterId, String text, CharacterComment replyTo, long userId) {
        this.characterId = characterId;
        this.text = text;
        this.replyTo = replyTo;
        this.userId = userId;
    }

    public long getCharacterId() {
        return characterId;
    }

    public String getText() {
        return text;
    }

    public CharacterComment getReplyTo() {
        return replyTo;
    }

    public long getUserId() {
        return userId;
    }
}
