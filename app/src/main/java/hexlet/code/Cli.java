package hexlet.code;

import java.util.Scanner;

public class Cli {
    static String userName;
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String clientName = scanner.next();
        System.out.println("Hello, " + clientName + '!');
        userName = clientName;
    }
}
