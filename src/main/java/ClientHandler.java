import domain.Player;

import java.net.Socket;

/**
 * @author Veliki ćale programiranja, a još veći softverski arhitekta L. Jelisavac
 */

public class ClientHandler implements Runnable {

    Player player;
    Socket socket;

    public synchronized void initPlayer() {
        throw new UnsupportedOperationException();
    }

    public synchronized void initPlayerTable() {
        throw new UnsupportedOperationException();
    }

    public synchronized void updateTable() {
        throw new UnsupportedOperationException();
    }

    public void sendTurn() {
        throw new UnsupportedOperationException();
    }

    public int[] getMove() {
        throw new UnsupportedOperationException();
    }

    public void sendMove() {
        throw new UnsupportedOperationException();
    }

    public void sendResult() {
        throw new UnsupportedOperationException();
    }

    public void closeConnection() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void run() {

    }
}
