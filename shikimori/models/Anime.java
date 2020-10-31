package shikimori.models;

import shikimori.Genre;
import shikimori.Type;

import java.util.List;
import java.util.Set;

public class Anime {
    private final String title;
    private final float score;
    private final Set<Genre> genreSet;
    private final Type type;
    private final List<Comment> commentList;
    private final List<MainCharacter> mainCharacters;

    public Anime(String title, float score, Set<Genre> genreSet, Type type, List<Comment> commentList, List<MainCharacter> mainCharacters) {
        this.title = title;
        this.score = score;
        this.genreSet = genreSet;
        this.type = type;
        this.commentList = commentList;
        this.mainCharacters = mainCharacters;
    }

    public float getScore() {
        return score;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public Type getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public Set<Genre> getGenreSet() {
        return genreSet;
    }

    public List<MainCharacter> getMainCharacters() {
        return mainCharacters;
    }
}
