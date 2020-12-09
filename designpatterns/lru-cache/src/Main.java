public class Main {
    public static void main(String[] args) {
        LRUCache<Song, Integer> lruCache = new LRUCache<>(2);
        Song song1, song2;
        lruCache.put(song1 = new Song("a", "b"), 1);
        System.out.println(lruCache.get(song1));
        lruCache.put(song2 = new Song("b", "c"), 2);
        lruCache.put(song2, 3);
        lruCache.put(new Song("x", "y"), 4);
        System.out.println(lruCache.get(song1));
        System.out.println(lruCache.get(song2));
        System.out.println(lruCache.get(new Song("h", "g")));
    }
}
