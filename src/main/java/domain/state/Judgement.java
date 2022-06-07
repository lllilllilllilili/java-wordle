package domain.state;

import domain.vo.JudgeResult;
import domain.vo.UserInput;

public interface Judgement {
    public JudgeResult execute(String answer, UserInput input);
}
