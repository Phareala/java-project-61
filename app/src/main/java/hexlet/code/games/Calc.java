package hexlet.code.games;

import hexlet.code.core.Engine;

import static hexlet.code.core.Utils.randomNumber;


public class Calc {

    public static final int CALC = 3;
    private static final char[] OPERANDS = {'+', '-', '*'};
    private static final String GAME_RULES = "What is the result of the expression?";
    private static final int QUESTIONS_NUMBER = 3;
    private static final int QUESTION_ID = 0;
    private static final int ANSWER_ID = 1;

    public static void initCalcGame() {
        String[][] questions = genQuestions();
        Engine.gameInit(GAME_RULES, questions);
    }

    private static String[][] genQuestions() {
        String[][] question = new String[QUESTIONS_NUMBER][2];
        for (int i = 0; i < QUESTIONS_NUMBER; i++) {
            var randomOperand = randomNumber(OPERANDS.length);
            int tempRandomNumber1 = randomNumber();
            int tempRandomNumber2 = randomNumber();
            var operand = OPERANDS[randomOperand];
//            question[i][questionID] = Integer.toString(tempRandomNumber1 + operand + tempRandomNumber2);
            question[i][QUESTION_ID] = String.format("%d %s %d", tempRandomNumber1, operand, tempRandomNumber2);
            question[i][ANSWER_ID] = Integer.toString(getAnswer(tempRandomNumber1, operand, tempRandomNumber2));
        }
        return question;
    }

    private static int getAnswer(int number1, char operand, int number2) {
        return switch (operand) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> throw new IllegalStateException("Unexpected value: " + operand);
        };
    }
}
