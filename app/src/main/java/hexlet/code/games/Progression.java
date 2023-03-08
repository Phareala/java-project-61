package hexlet.code.games;

import hexlet.code.core.Logic;

import java.util.Random;

public class Progression implements Logic {

    private String roundAnswer;
    private String result;

    int maxRange = 15;

    public String getGameDescription() {
        return "What number is missing in the progression?";
    }

    public String getRoundQuestion() {
        Random random = new Random();
        int number = random.nextInt(1, 21);
        int progressionIndex = random.nextInt(1, 6);
        int range = random.nextInt(5, maxRange + 1);
        int hiddenNumber = random.nextInt(range);
        String[] list = new String[range];
        for (var i = 0; i < range; i++) {
            list[i] = Integer.toString(number);
            number += progressionIndex;
        }
        roundAnswer = list[hiddenNumber];
        list[hiddenNumber] = "..";
        result = String.join(" ", list);
        return result;
    }

    public String getRoundAnswer() {
        return roundAnswer;
    }
}
