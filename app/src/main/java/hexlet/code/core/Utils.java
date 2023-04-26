package hexlet.code.core;

import java.util.Random;

public class Utils {

    private static final int MAX_RANDOM_NUMBER = 100;
    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(1, MAX_RANDOM_NUMBER);
    }

    public static int randomNumber(int max) {
        Random random = new Random();
        return random.nextInt(1, max);
    }

    public static int randomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max);
    }

}
