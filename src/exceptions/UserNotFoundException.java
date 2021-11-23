package exceptions;

public class UserNotFoundException extends FlipSnapException {

    public UserNotFoundException(String message) {
        super(message);
    }
}
