package hexlet.code.games;

import hexlet.code.core.Engine;

import static hexlet.code.core.Engine.randomNumber;

public class Even {
    private static final String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int questionsNumber = 3;
    private static final int questionID = 0;
    private static final int answerID = 1;

    public static void initEvenGame() {
        String[][] questions = genQuestions();
        Engine.gameInit(gameRules, questions);
    }

    private static String[][] genQuestions() {
        String[][] question = new String[questionsNumber][2];
        for (int i = 0; i < questionsNumber; i++) {
            int tempRandomNumber = randomNumber();
            question[i][questionID] = Integer.toString(tempRandomNumber);
            question[i][answerID] = isEven(tempRandomNumber);
        }
        return question;
    }

    private static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}
