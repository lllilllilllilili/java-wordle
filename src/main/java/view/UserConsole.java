package view;

import domain.vo.UserInput;

import java.util.Scanner;

public class UserConsole {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String FIRST_MESSAGE = "문자열을 입력해주세요.";

    public static UserInput inputString() {
        System.out.println(FIRST_MESSAGE);
        return UserInput.validateUserInput(SCANNER.nextLine());
    }

}
