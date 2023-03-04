package hexlet.code.games;

import hexlet.code.core.Engine;
import hexlet.code.core.Logic;

import java.util.Random;

public class GCD implements Logic {

    private int roundAnswer;
    private String result;

    public String getGameDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    public String getRoundQuestion() {
        Random random = new Random();
        int maxValue = 100;
        var number1 = random.nextInt(maxValue);
        var number2 = random.nextInt(maxValue);
        roundAnswer = Engine.gcd(number1, number2);
        result = Integer.toString(roundAnswer);
        return number1 + " " + number2;
    }

    public String getRoundAnswer() {
        return result;
    }
}
