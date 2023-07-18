package hexlet.code.games;


import static hexlet.code.core.Engine.ANSWER_ID;
import static hexlet.code.core.Engine.QUESTION_ID;
import static hexlet.code.core.Engine.QUESTIONS_NUMBERS;
import static hexlet.code.core.Engine.gameInit;
import static hexlet.code.core.Utils.randomNumber;


public class Calc {

    public static final int CALC = 3;
    private static final char[] OPERANDS = {'+', '-', '*'};
    private static final String GAME_RULES = "What is the result of the expression?";

    public static void initCalcGame() {
        String[][] questions = genQuestions();
        gameInit(GAME_RULES, questions);
    }

    private static String[][] genQuestions() {
        String[][] question = new String[QUESTIONS_NUMBERS][2];
        for (int i = 0; i < QUESTIONS_NUMBERS; i++) {
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
