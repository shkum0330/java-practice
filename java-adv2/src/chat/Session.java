package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static network.tcp.SocketCloseUtil.closeAll;
import static util.MyLogger.log;

public class Session implements Runnable {
    private final Socket socket;
    private final DataInputStream input;
    private final DataOutputStream output;
    private final SessionManager sessionManager;
    private boolean closed = false;
    private String nickname = null;

    public Session(Socket socket, SessionManager sessionManager) throws IOException {
        this.socket = socket;
        this.input = new DataInputStream(socket.getInputStream());
        this.output = new DataOutputStream(socket.getOutputStream());
        this.sessionManager = sessionManager;
        this.sessionManager.add(this);
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void run() {
        try {
            // 클라이언트로부터 문자 받기
            while (true) {
                String received = input.readUTF();
                String toSend;

                if(!received.startsWith("/join") && nickname == null) {
                    toSend = "닉네임을 설정해 주세요.";
                    output.writeUTF(toSend);
                    continue;
                }

                if(received.startsWith("/join")) {
                    this.nickname=received.substring(6);
                    toSend = "닉네임 설정 완료: "+this.nickname;
                    output.writeUTF(toSend);
                    continue;
                }

                if(received.startsWith("/message")) {
                    for (Session s: sessionManager.getSessions())
                    toSend = "["+nickname+"] "+received.substring(9);
                    output.writeUTF(toSend);
                    log(toSend);
                    continue;
                }

                if(received.startsWith("/change")) {
                    this.nickname=received.substring(6);
                    toSend = "닉네임 변경 완료: "+this.nickname;
                    output.writeUTF(toSend);
                    continue;
                }

                if (received.equals("exit")) {
                    break;
                }
            }
        } catch (IOException e) {
            log(e);
        } finally {
            sessionManager.remove(this);
            close();
        }
    }

    public synchronized void close() {
        if(closed){
            return;
        }
        closeAll(socket, input, output);
        closed = true;
        log("연결 종료: " + socket);
    }
}
