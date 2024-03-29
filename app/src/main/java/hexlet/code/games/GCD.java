package hexlet.code.games;


import static hexlet.code.core.Utils.randomNumber;
import static hexlet.code.core.Engine.ANSWER_ID;
import static hexlet.code.core.Engine.QUESTION_ID;
import static hexlet.code.core.Engine.QUESTIONS_NUMBERS;
import static hexlet.code.core.Engine.gameInit;

public class GCD {
    public static final int GCD = 4;
    private static final String GAME_RULES = "Find the greatest common divisor of given numbers.";

    public static void initGCDGame() {
        String[][] questions = genQuestions();
        gameInit(GAME_RULES, questions);
    }

    private static String[][] genQuestions() {
        String[][] question = new String[QUESTIONS_NUMBERS][2];
        for (int i = 0; i < QUESTIONS_NUMBERS; i++) {
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
