package hexlet.code.core;

import java.util.Scanner;

public class Engine {

    public static final int QUESTION_ID = 0;
    public static final int ANSWER_ID = 1;
    public static final int QUESTIONS_NUMBERS = 3;

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void gameInit(String gameRules, String[][] questions) {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String clientName = scanner.next();
        System.out.println("Hello, " + clientName + '!');
        System.out.println(gameRules);
        for (String[] question : questions) {
            System.out.println("Question: " + question[QUESTION_ID]);
            System.out.print("Your answer: ");
            String answer = SCANNER.next();

            if (answer.equals(question[ANSWER_ID])) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n",
                        answer, question[ANSWER_ID]);
                System.out.println("Let's try again, " + clientName + '!');
                return;
            }
        }
        System.out.printf("Congratulations, " + clientName + '!');
    }
}
