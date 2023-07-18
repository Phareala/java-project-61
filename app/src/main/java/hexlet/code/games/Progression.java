package hexlet.code.games;


import static hexlet.code.core.Utils.randomNumber;
import static hexlet.code.core.Engine.ANSWER_ID;
import static hexlet.code.core.Engine.QUESTION_ID;
import static hexlet.code.core.Engine.QUESTIONS_NUMBERS;
import static hexlet.code.core.Engine.gameInit;

public class Progression {

    public static final int PROGRESSION = 5;
    private static final String GAME_RULES = "What number is missing in the progression?";
    private static final int MIN_RANGE = 5;
    private static final int MAX_RANGE = 15;
    private static final int MAX_INDEX = 10;

    public static void initProgressionGame() {
        String[][] questions = genQuestions();
        gameInit(GAME_RULES, questions);
    }

    private static String[][] genQuestions() {
        String[][] question = new String[QUESTIONS_NUMBERS][2];
        for (int i = 0; i < QUESTIONS_NUMBERS; i++) {
            int range = randomNumber(MIN_RANGE, MAX_RANGE);
            int firstNumber = randomNumber(1, MAX_INDEX);
            int progressionIndex = randomNumber(1, MAX_INDEX);
            int hiddenNumber = randomNumber(range);
            String[] generatedProgression = genProgression(range, progressionIndex, firstNumber);
            String answer = generatedProgression[hiddenNumber];
            String completeProgression = makeProgression(generatedProgression, hiddenNumber);
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

    private  static  String makeProgression(String[] list, int hiddenNumber) {
        list[hiddenNumber] = "..";
        return String.join(" ", list);
    }
}
