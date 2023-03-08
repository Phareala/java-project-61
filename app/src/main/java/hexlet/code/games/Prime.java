package hexlet.code.games;

import hexlet.code.core.Engine;
import hexlet.code.core.Logic;

import java.util.Random;

public class Prime implements Logic {

    private String roundAnswer;
    private String result;
    int maxValue = 30;

    public String getGameDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public String getRoundQuestion() {
        Random random = new Random();
        var temp = random.nextInt(1, maxValue);
        result = Integer.toString(temp);
        roundAnswer = (Engine.prime(temp)) ? "yes" : "no";
        return result;
    }

    public String getRoundAnswer() {
        return roundAnswer;
    }
}
