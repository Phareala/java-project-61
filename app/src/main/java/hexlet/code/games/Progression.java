package hexlet.code.games;

import hexlet.code.core.Engine;
import java.util.Random;

public class Progression {

    private static final String GAME_RULES = "What number is missing in the progression?";
    private static final int QUESTIONS_NUMBER = 3;
    private static final int QUESTION_ID = 0;
    private static final int ANSWER_ID = 1;
    private static final int MAX_RANGE = 15;
    private static final int MAX_INDEX = 10;

    public static void initProgressionGame() {
        String[][] questions = genQuestions();
        Engine.gameInit(GAME_RULES, questions);
    }

    private static String[][] genQuestions() {
        Random random = new Random();
        String[][] question = new String[QUESTIONS_NUMBER][2];
        for (int i = 0; i < QUESTIONS_NUMBER; i++) {
            int range = random.nextInt(5, MAX_RANGE);
            int firstNumber = random.nextInt(1, MAX_INDEX);
            int progressionIndex = random.nextInt(1, MAX_INDEX);
            int hiddenNumber = random.nextInt(range);
            String[] generatedProgression = genProgression(range, progressionIndex, firstNumber);
            String answer = generatedProgression[hiddenNumber];
            String completeProgression = hideNumber(generatedProgression, hiddenNumber);
            question[i][QUESTION_ID] = String.format(completeProgression);
            question[i][ANSWER_ID] = answer;
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
