package hexlet.code.games;

import hexlet.code.core.Engine;

import java.util.Random;

import static hexlet.code.core.Engine.randomNumber;

public class Calc {

    public String getGameDescription() {
        return "What is the result of the expression?";
    }

    private static String[][] genQuestions() {
        Random random = new Random();
        int maxValue = 50;
        var number1 = random.nextInt(maxValue);
        var number2 = random.nextInt(maxValue);
        var randomOperand = random.nextInt(operands.length);

        var operand = operands[randomOperand];
        switch (operand) {
            case '+' -> {
                roundAnswer = number1 + number2;
            }
            case '-' -> {
                roundAnswer = number1 - number2;
            }
            case '*' -> {
                roundAnswer = number1 * number2;
            }
            default -> {
                System.out.println("ERROR");
            }
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
