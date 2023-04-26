package hexlet.code.games;

import hexlet.code.core.Engine;

import static hexlet.code.core.Utils.randomNumber;


public class GCD {
    private static final String GAME_RULES = "Find the greatest common divisor of given numbers.";
    private static final int QUESTIONS_NUMBER = 3;
    private static final int QUESTION_ID = 0;
    private static final int ANSWER_ID = 1;

    public static void initGCDGame() {
        String[][] questions = genQuestions();
        Engine.gameInit(GAME_RULES, questions);
    }

    private static String[][] genQuestions() {
        String[][] question = new String[QUESTIONS_NUMBER][2];
        for (int i = 0; i < QUESTIONS_NUMBER; i++) {
            int tempRandomNumber1 = randomNumber();
            int tempRandomNumber2 = randomNumber();
            question[i][QUESTION_ID] = String.format("%d %d", tempRandomNumber1, tempRandomNumber2);
            question[i][ANSWER_ID] = Integer.toString(gcd(tempRandomNumber1, tempRandomNumber2));
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
