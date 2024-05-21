package exception.ex1.unchecked;

public class Client {
    public void call() {
        throw new MyUncheckedException("ex");
    }
}
