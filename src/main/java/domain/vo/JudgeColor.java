package domain.vo;

import java.util.stream.IntStream;

public class JudgeColor {

    private final String ansStr;
    private final String input;
    private final boolean[] answerWords;
    private final boolean[] inputUser;
    private final JudgeResult judgeResult;

    public JudgeColor(String ansStr, String input, boolean[] answer, boolean[] inputUser, JudgeResult judgeResult) {
        this.ansStr = ansStr;
        this.input = input;
        this.answerWords = answer;
        this.inputUser = inputUser;
        this.judgeResult = judgeResult;
    }

    public void verifyGreen(char input, char ans, int idx) {
        if(ans == input) {
            answerWords[idx] = true;
            inputUser[idx] = true;
            judgeResult.setColor(idx, Color.GREEN);
        }
    }
    public void verifyYellow() {
        for(int i = 0; i < input.length(); i++) {
            if (inputUser[i]) {
                continue;
            }
            for(int j = 0; j < ansStr.length(); j++) {
                if(!answerWords[j] && (input.charAt(i) == ansStr.charAt(j))) {
                    answerWords[j] = true;
                    inputUser[i] = true;
                    judgeResult.setColor(i, Color.YELLOW);
                    break;
                }
            }
        }
    }

    public void verifyGray(boolean[] inputUsed, JudgeResult judgeResult) {
        for (int i = 0; i < inputUsed.length; i++) {
            if (!inputUsed[i]) {
                judgeResult.setColor(i, Color.GRAY);
            }
        }
    }
}
