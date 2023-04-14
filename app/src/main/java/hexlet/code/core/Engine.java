package hexlet.code.core;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    private static final int maxRandomNumber = 100;
    private static final int questionID = 0;
    private static final int answerID = 1;
    private static String clientName;
    private static final Scanner scanner = new Scanner(System.in);

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        clientName = scanner.next();
        System.out.println("Hello, " + clientName + '!');
    }


    public static void gameInit (String gameRules, String[][] questions) {
        greeting();
        System.out.println(gameRules);
        for (String[] question : questions) {
            System.out.println("Question: " + question[questionID]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(question[answerID])) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + '\'' + question[answerID] + '\'');
                System.out.println("Let's try again, " + clientName + '!');
                return;
            }
        }
        System.out.printf("Congratulations, " + clientName + '!');
    }


    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(1, maxRandomNumber);
    }
}
