package hexlet.code.core;

import hexlet.code.Cli;
import java.util.Scanner;

public final class Engine {

    public static String getUserAnswer(String text) {

        var input = new Scanner(System.in);
        System.out.print(text);

        return input.nextLine();
    }

    public Engine(Logic temp) {
        this.game = temp;
    }
    private final Logic game;

    public void launchGame() {
//        String tempAnswer;
        Cli.greeting();
        String clientName = Cli.getName();
        System.out.println(game.getGameDescription());
        int rounds = 3;
        for (var i = 0; i < rounds; i++) {
            System.out.println("Question: " + game.getRoundQuestion());
            var tempAnswer = getUserAnswer("Your answer: ");
            if (tempAnswer.equals(game.getRoundAnswer())) {
                System.out.println("Correct!");
            } else {
                System.out.println('\'' + tempAnswer + "' is wrong answer ;(. Correct answer was '" + game.getRoundAnswer() + "'.");
                System.out.println("Let's try again, " + clientName + '!');
                return;
            }
        }
        System.out.println("Congratulations, " + clientName + '!');
    }

    public static int gcd(int number1, int number2) {
        int temp = Math.max(number1, number2);
        for (int i = temp; i > 0; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                return i;
            }
        }
        return 0;
    }
}
