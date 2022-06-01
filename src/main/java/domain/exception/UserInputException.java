package domain.exception;

public class UserInputException extends IllegalArgumentException{
    public UserInputException(String message) {
        super(message);
    }
}
