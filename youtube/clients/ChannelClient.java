package youtube.clients;

import youtube.models.Channel;

import java.util.List;
import java.util.Random;

public class ChannelClient {
    private static final Random random = new Random();

    public static Channel getRandomChannel() {
        return new Channel(Math.abs(random.nextLong()), Math.abs(random.nextLong()),Math.abs(random.nextLong()));
    }
}
