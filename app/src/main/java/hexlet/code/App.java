package hexlet.code;

import hexlet.code.core.Engine;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case (1) ->
                    Cli.greeting();
            case (2) -> {
                var game = new Even();
                new Engine(game).launchGame();
            }
            case (3) -> {
                var game = new Calc();
                new Engine(game).launchGame();
            }
            case (4) -> {
                var game = new GCD();
                new Engine(game).launchGame();
            }
            default -> System.out.println("Goodbye");

        }
    }
}
