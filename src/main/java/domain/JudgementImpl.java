package domain;

import domain.state.Judgement;
import domain.vo.JudgeColor;
import domain.vo.JudgeResult;
import domain.vo.UserInput;

import java.util.stream.IntStream;

public class JudgementImpl implements Judgement {

    private JudgeColor judgeColor;

    public JudgementImpl(JudgeColor judgeColor) {
        this.judgeColor = judgeColor;
    }

    @Override
    public JudgeResult execute(String answer, UserInput input) {
        int length = input.getName()
                          .length();

        JudgeResult result = new JudgeResult(answer.length());
        IntStream.rangeClosed(0, length)
                 .forEach(idx -> judgeColor.verifyGreen(answer.charAt(idx), input.getName().charAt(idx), idx));




        return result;
    }
}
