package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static final int CLI = 1;
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String clientName = scanner.next();
        System.out.println("Hello, " + clientName + '!');
    }
}
