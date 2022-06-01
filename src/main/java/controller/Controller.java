package controller;

import domain.state.AnswerGenerator;
import utils.AnswerGeneratorImpl;
import view.UserConsole;

public class Controller {
    public static void run() {
        UserConsole userConsole = new UserConsole();
        AnswerGenerator answerGenerator = new AnswerGeneratorImpl();
    }
}
