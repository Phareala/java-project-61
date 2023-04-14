package hexlet.code.games;

import hexlet.code.core.Engine;

import static hexlet.code.core.Engine.randomNumber;

public class GCD {
    private static final String gameRules = "Find the greatest common divisor of given numbers.";
    private static final int questionsNumber = 3;
    private static final int questionID = 0;
    private static final int answerID = 1;

    public static void initGCDGame() {
        String[][] questions = genQuestions();
        Engine.gameInit(gameRules, questions);
    }

    private static String[][] genQuestions() {
        String[][] question = new String[questionsNumber][2];
        for (int i = 0; i < questionsNumber; i++) {
            int tempRandomNumber1 = randomNumber();
            int tempRandomNumber2 = randomNumber();
            question[i][questionID] = String.format("%d %d", tempRandomNumber1, tempRandomNumber2);
            question[i][answerID] = Integer.toString(gcd(tempRandomNumber1, tempRandomNumber2));
        }
        return question;
    }

    public static int gcd(int number1, int number2) {
        int temp = Math.max(number1, number2);
        for (int i = temp; i > 0; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                return i;
            }
        }
        return 0;
    }
}
