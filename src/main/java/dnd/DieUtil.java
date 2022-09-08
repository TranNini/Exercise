package dnd;

import java.util.Random;

public class DieUtil {

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

    public static int roll3d20() {
        int resultThrow = 0;
        for (int i = 1; i < 4; i++) {
            resultThrow += rollD20(0);
        }
        return resultThrow;
    }

    public static int roll4d6d1() {
        int resultThrow = 0;
        int lowestRoll = 6;
        for (int i = 1; i <5; i++) {
            int roll = rollD6(0);
            if (roll < lowestRoll) {
                lowestRoll = roll;
            }
            resultThrow += roll;
        }
        resultThrow -= lowestRoll;
        return resultThrow;
    }

    public static int roll(Die die){
        return random.nextInt(1, die.sides);
    }

    public static int roll(Die die, int diceAmount) {
        int resultThrow = 0;
        for (int i = 1; i < diceAmount; i++) {
           resultThrow += roll(die);
        }
        return resultThrow;
    }
}
