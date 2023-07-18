package hexlet.code.games;


import static hexlet.code.core.Utils.randomNumber;
import static hexlet.code.core.Engine.*;

public class Prime {

    public static final int PRIME = 6;
    private static final String GAME_RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void initPrimeGame() {
        String[][] questions = genQuestions();
        gameInit(GAME_RULES, questions);
    }

    private static String[][] genQuestions() {
        String[][] question = new String[QUESTIONS_NUMBERS][2];
        for (int i = 0; i < QUESTIONS_NUMBERS; i++) {
            int tempRandomNumber = randomNumber();
            question[i][QUESTION_ID] = Integer.toString(tempRandomNumber);
            question[i][ANSWER_ID] = isPrime(tempRandomNumber) ? "yes" : "no";
        }
        return question;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
