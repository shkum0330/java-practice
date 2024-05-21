package exception.ex2;


public class NetworkService {
    public void sendMessage(String data) throws NetworkClientException {
        String address = "http://example.com";
        NetworkClient client = new NetworkClient(address);

        client.initError(data);

        try{
            client.connect();
            client.send(data);

        }catch (NetworkClientException e){
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }finally {
            client.disconnect();
        }

    }
}
