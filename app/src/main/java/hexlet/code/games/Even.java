package hexlet.code.games;


import static hexlet.code.core.Engine.ANSWER_ID;
import static hexlet.code.core.Engine.QUESTION_ID;
import static hexlet.code.core.Engine.QUESTIONS_NUMBERS;
import static hexlet.code.core.Engine.gameInit;
import static hexlet.code.core.Utils.randomNumber;


public class Even {
    public static final int EVEN = 2;
    private static final String GAME_RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";


    public static void initEvenGame() {
        String[][] questions = genQuestions();
        gameInit(GAME_RULES, questions);
    }

    private static String[][] genQuestions() {
        String[][] question = new String[QUESTIONS_NUMBERS][2];
        for (int i = 0; i < QUESTIONS_NUMBERS; i++) {
            int tempRandomNumber = randomNumber();
            question[i][QUESTION_ID] = Integer.toString(tempRandomNumber);
            question[i][ANSWER_ID] = (isEven(tempRandomNumber)) ? "yes" : "no";
        }
        return question;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
