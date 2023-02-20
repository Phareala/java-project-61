package hexlet.code;

import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n0 - Exit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case  (1):
                Cli.greeting();
                break;
            case (2):
                Even.evenGame();
            default:
                break;
        }
    }
}
