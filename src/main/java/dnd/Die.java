package dnd;

import java.util.Random;

public class Die {

    static Random random = new Random();

    public static int rollD4(int modifier) {
        return random.nextInt(1,5) + modifier;
    }

    public static int rollD6(int modifier) {
        return random.nextInt(1,7) + modifier;
    }

    public static int rollD8(int modifier) {
        return random.nextInt(1, 9) + modifier;
    }

    public static int rollD10(int modifier) {
        return random.nextInt(1, 11) + modifier;
    }

    public static int rollD12(int modifier) {
        return random.nextInt(1, 13) + modifier;
    }

    public static int rollD20(int modifier) {
        return random.nextInt(1, 21) + modifier;
    }

    public static int roll3d6() {
        int resultThrow = 0;
        for (int i = 1; i < 4; i++) {
            resultThrow += rollD6(0);
        }
        return resultThrow;
    }
}
