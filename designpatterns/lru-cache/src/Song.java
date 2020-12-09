import java.util.Objects;

public class Song {
    private final String name;
    private final String singer;

    public Song(String name, String singer) {
        this.name = name;
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public String getSinger() {
        return singer;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Song song = (Song)obj;
        return name.equals(song.name) && singer.equals(song.singer);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, singer);
    }
}
