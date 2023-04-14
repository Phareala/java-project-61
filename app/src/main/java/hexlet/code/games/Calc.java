package hexlet.code.games;

import hexlet.code.core.Engine;

import java.util.Random;

import static hexlet.code.core.Engine.randomNumber;

public class Calc {

    private static final char[] operands = {'+', '-', '*'};
    private static final String gameRules = "What is the result of the expression?";
    private static final int questionsNumber = 3;
    private static final int questionID = 0;
    private static final int answerID = 1;

    public static void initCalcGame() {
        String[][] questions = genQuestions();
        Engine.gameInit(gameRules, questions);
    }

    private static String[][] genQuestions() {
        Random random = new Random();
        String[][] question = new String[questionsNumber][2];
        for (int i = 0; i < questionsNumber; i++) {
            var randomOperand = random.nextInt(operands.length);
            int tempRandomNumber1 = randomNumber();
            int tempRandomNumber2 = randomNumber();
            var operand = operands[randomOperand];
//            question[i][questionID] = Integer.toString(tempRandomNumber1 + operand + tempRandomNumber2);
            question[i][questionID] = String.format("%d %s %d", tempRandomNumber1,operand, tempRandomNumber2);
            question[i][answerID] = Integer.toString(getAnswer(tempRandomNumber1, operand, tempRandomNumber2));
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
