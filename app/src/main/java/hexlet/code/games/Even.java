package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class Even {
    public static void evenGame() {
        Scanner scanner = new Scanner(System.in);
        Cli.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var checker = true;
        var i = 0;
        while(i < 3) {
            String answer;
            if(checker) {
                int number = (int) (Math.random() * 10);
                if(number % 2 == 0) {
                    answer = "yes";
                } else {
                    answer = "no";
                }
                System.out.println("Question: " + number);
                System.out.print("Your answer: ");
                String cliAnswer = scanner.next();
                if (cliAnswer.equals(answer)) {
                    System.out.println("Correct!");
                    i++;
                } else {
                    System.out.println(cliAnswer + " is wrong answer ;(. Correct answer was " + answer);
                    checker = false;
                }
            if(checker) {
                System.out.println("Congratulations " + Cli.getName() + '!');
            }
            }
        }
    }
}
