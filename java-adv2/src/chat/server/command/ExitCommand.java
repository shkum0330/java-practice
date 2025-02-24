package chat.server.command;

import chat.server.Session;
import chat.server.SessionManager;

import java.io.IOException;
import java.util.List;

public class ExitCommand implements Command {

    @Override
    public void execute(String[] args, Session session) throws IOException {
        throw new IOException("exit");
    }
}
