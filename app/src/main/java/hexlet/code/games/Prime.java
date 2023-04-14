package hexlet.code.games;

import hexlet.code.core.Engine;
import static hexlet.code.core.Engine.randomNumber;

public class Prime {

    private static final String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int questionsNumber = 3;
    private static final int questionID = 0;
    private static final int answerID = 1;

    public static void initPrimeGame() {
        String[][] questions = genQuestions();
        Engine.gameInit(gameRules, questions);
    }

    private static String[][] genQuestions() {
        String[][] question = new String[questionsNumber][2];
        for (int i = 0; i < questionsNumber; i++) {
            int tempRandomNumber = randomNumber();
            question[i][questionID] = Integer.toString(tempRandomNumber);
            question[i][answerID] = isPrime(tempRandomNumber);
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
