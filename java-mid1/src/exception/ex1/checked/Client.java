package exception.ex1.checked;

public class Client {
    public void call() throws MyCheckedException{
        throw new MyCheckedException("ex");
    }
}
