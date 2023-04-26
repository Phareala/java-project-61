package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc");
        System.out.println("4 - GCD\n5 - Progression\n6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case Cli.CLI -> Cli.greeting();
            case Even.EVEN -> Even.initEvenGame();
            case Calc.CALC -> Calc.initCalcGame();
            case GCD.GCD -> GCD.initGCDGame();
            case Progression.PROGRESSION -> Progression.initProgressionGame();
            case Prime.PRIME -> Prime.initPrimeGame();
            default -> System.out.println("Goodbye!");

        }
    }
}
