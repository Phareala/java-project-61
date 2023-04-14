package hexlet.code.games;

import hexlet.code.core.Engine;

import static hexlet.code.core.Engine.randomNumber;

public class Even {
    private static final String GAME_RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int QUESTIONS_NUMBERS = 3;
    private static final int QUESTION_ID = 0;
    private static final int ANSWER_ID = 1;

    public static void initEvenGame() {
        String[][] questions = genQuestions();
        Engine.gameInit(GAME_RULES, questions);
    }

    private static String[][] genQuestions() {
        String[][] question = new String[QUESTIONS_NUMBERS][2];
        for (int i = 0; i < QUESTIONS_NUMBERS; i++) {
            int tempRandomNumber = randomNumber();
            question[i][QUESTION_ID] = Integer.toString(tempRandomNumber);
            question[i][ANSWER_ID] = isEven(tempRandomNumber);
        }
        return question;
    }

    private static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}
