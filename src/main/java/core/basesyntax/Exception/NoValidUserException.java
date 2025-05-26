package core.basesyntax.Exception;

public class NoValidUserException extends RuntimeException {
    public NoValidUserException(String message) {
        super(message);
    }
}
