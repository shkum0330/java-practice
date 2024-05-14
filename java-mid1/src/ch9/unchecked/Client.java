package ch9.unchecked;

import ch9.checked.MyCheckedException;

public class Client {
    public void call() {
        throw new MyUncheckedException("ex");
    }
}
