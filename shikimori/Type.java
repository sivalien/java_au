package shikimori;

public enum Type {
    TV_SERIES("TV Series"),
    MOVIE("Movie"),
    ONA("ONA"),
    SRECIAL("Special"),
    OVA("Ova");

    private String value;

    Type(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
