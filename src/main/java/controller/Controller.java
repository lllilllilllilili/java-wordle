package controller;

import domain.state.AnswerGenerator;
import domain.vo.UserInput;
import utils.AnswerGeneratorImpl;
import view.UserConsole;

public class Controller {
    public static void run() {
        UserInput userInput = UserConsole.inputString();
        AnswerGenerator answerGenerator = new AnswerGeneratorImpl();
    }
}
