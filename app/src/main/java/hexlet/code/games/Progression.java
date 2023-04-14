package hexlet.code.games;

import hexlet.code.core.Engine;
import java.util.Random;

public class Progression {

    private static final String gameRules = "What number is missing in the progression?";
    private static final int questionsNumber = 3;
    private static final int questionID = 0;
    private static final int answerID = 1;
    private static final int maxRange = 15;
    private static final int maxIndex = 10;

    public static void initProgressionGame() {
        String[][] questions = genQuestions();
        Engine.gameInit(gameRules, questions);
    }

    private static String[][] genQuestions() {
        Random random = new Random();
        String[][] question = new String[questionsNumber][2];
        for (int i = 0; i < questionsNumber; i++) {
            int range = random.nextInt(5, maxRange);
            int firstNumber = random.nextInt(1, maxIndex);
            int progressionIndex = random.nextInt(1, maxIndex);
            int hiddenNumber = random.nextInt(range);
            String[] generatedProgression = genProgression(range, progressionIndex, firstNumber);
            String answer = generatedProgression[hiddenNumber];
            String completeProgression = hideNumber(generatedProgression, hiddenNumber);
            question[i][questionID] = String.format(completeProgression);
            question[i][answerID] = answer;
        }
        return question;
    }

    private static String[] genProgression(int range, int progressionIndex, int firstNumber) {
        String[] list = new String[range];
        for (var i = 0; i < range; i++) {
            list[i] = Integer.toString(firstNumber);
            firstNumber += progressionIndex;
        }
        return list;
    }

    private  static  String hideNumber(String[] list, int hiddenNumber) {
        list[hiddenNumber] = "..";
        return String.join(" ", list);
    }
}
