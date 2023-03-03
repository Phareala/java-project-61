package hexlet.code.games;

import hexlet.code.core.Logic;

import java.util.Random;

//public class Even {
//    public static void evenGame() {
//        Scanner scanner = new Scanner(System.in);
//        Cli.greeting();
//        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
//        var i = 0;
//        while (i < 3) {
//            String answer;
//            int number = (int) (Math.random() * 10);
//            answer = (number % 2 == 0) ? "yes" : "no";
//            System.out.println("Question: " + number);
//            System.out.print("Your answer: ");
//            String cliAnswer = scanner.next();
//            if (cliAnswer.equals(answer)) {
//                System.out.println("Correct!");
//                i++;
//            } else {
//                System.out.println("'" + cliAnswer + "'" + " is wrong answer ;(. Correct answer was " + "'" + answer + "'.");
//                System.out.println("Let's try again, " + Cli.getName() + '!');
//                break;
//            }
//            System.out.println("Congratulations, " + Cli.getName() + '!');
//        }
//    }
//}

public class Even implements Logic {

    private String answer;

    public String getGameDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public String getRoundQuestion() {
        Random random = new Random();
        int maxValue = 100;
        int number = random.nextInt(maxValue);
        String result = Integer.toString(number);
        answer = (number % 2 == 0) ? "yes" : "no";
        return result;
    }

    public String getRoundAnswer() {
        return answer;
    }
}
