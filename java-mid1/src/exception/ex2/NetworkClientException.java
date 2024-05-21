package exception.ex2;

public class NetworkClientException extends Exception{
    private String errorCode;

    public NetworkClientException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
