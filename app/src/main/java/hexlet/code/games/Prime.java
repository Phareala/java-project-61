package hexlet.code.games;

import hexlet.code.core.Engine;
import static hexlet.code.core.Utils.randomNumber;

public class Prime {

    public static final int PRIME = 6;
    private static final String GAME_RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int QUESTIONS_NUMBER = 3;
    private static final int QUESTION_ID = 0;
    private static final int ANSWER_ID = 1;

    public static void initPrimeGame() {
        String[][] questions = genQuestions();
        Engine.gameInit(GAME_RULES, questions);
    }

    private static String[][] genQuestions() {
        String[][] question = new String[QUESTIONS_NUMBER][2];
        for (int i = 0; i < QUESTIONS_NUMBER; i++) {
            int tempRandomNumber = randomNumber();
            question[i][QUESTION_ID] = Integer.toString(tempRandomNumber);
            question[i][ANSWER_ID] = isPrime(tempRandomNumber);
        }
        return question;
    }

    public static String isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
