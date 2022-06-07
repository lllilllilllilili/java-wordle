package domain.vo;

import domain.exception.UserInputException;

public class UserInput {

    private static final int MAGIC_NUMBER = 5;
    private String name;

    public UserInput(String name) {
        this.name = name;
    }

    public static UserInput validateUserInput(String value) {
        if (value.length() != MAGIC_NUMBER) {
            throw new UserInputException("문자열 길이가 잘못되었습니다.");
        }
        return new UserInput(value);
    }

    public String getName() {
        return name;
    }
}
