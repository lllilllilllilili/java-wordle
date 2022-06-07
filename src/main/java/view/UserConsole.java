package view;

import domain.vo.UserInput;

import java.util.Scanner;

public class UserConsole {

    private final Scanner SCANNER;
    private static final String FIRST_MESSAGE = "문자열을 입력해주세요.";

    //생성할 때 SCANNER가 나오는것을 확인할 수 있음
    public UserConsole() {
        SCANNER = new Scanner(System.in);
    }

    //만들어 두고 나중에 실행한다.
    public UserInput inputUserConsole() {
        return UserInput.validateUserInput(SCANNER.nextLine());
    }

}
