package chat.server;

public class ServerMain {
    private static final int PORT = 12345;
    public static void main(String[] args) {
        SessionManager sessionManager=new SessionManager();

        CommandManager commandManager=new CommandManagerV1(sessionManager);

        Server server=new Server(PORT,sessionManager,commandManager);
    }
}
