package shikimori;

public enum Genre {
    ACTION("Action"),
    DRAMA("Drama"),
    SEINEN("Seinen"),
    COMEDY("Comedy"),
    HORROR("Horror"),
    ADVENTURE("Adventure"),
    SUPERNATURAL("Supernatural"),
    MYSTERY("Mystery"),
    PSYCHOLOGICAL("Psychological");

    private String value;

    Genre(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
