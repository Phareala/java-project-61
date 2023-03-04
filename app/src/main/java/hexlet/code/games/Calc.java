package hexlet.code.games;

import hexlet.code.core.Logic;

import java.util.Random;

public class Calc implements Logic {

    private final char[] operands = {'+', '-', '*'};
    private int roundAnswer;
    private String result;

    public String getGameDescription() {
        return "What is the result of the expression?";
    }

    public String getRoundQuestion() {
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
        result = Integer.toString(roundAnswer);
        return number1 + " " + operand + " " + number2;
    }

    public String getRoundAnswer() {
        return  result;
    }
}
