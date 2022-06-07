package controller;

import domain.JudgementImpl;
import domain.state.AnswerGenerator;
import domain.state.Judgement;
import domain.vo.UserInput;
import utils.AnswerGeneratorImpl;
import view.UserConsole;

public class Controller {
    public static void run() {


    }

    public static void init() {
         UserConsole userConsole = new UserConsole();
         AnswerGenerator answerGenerator = new AnswerGeneratorImpl();
         Judgement judgement = new JudgementImpl();
    }

}
