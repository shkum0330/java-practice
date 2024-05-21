package exception.ex1.unchecked;

public class MyUncheckedException extends RuntimeException{
    public MyUncheckedException(String message) {
        super(message);
    }
}
