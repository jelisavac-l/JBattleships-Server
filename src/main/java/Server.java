/**
 * @author Veliki ćale programiranja, a još veći softverski arhitekta L. Jelisavac
 */

/*
    *** C1 je aktivni, C2 pasivni
    <-- obavesti aktivnog da je na na potezu
    <-- pasivni da ceka potez aktivnog
    --> potez od aktivnog
    <-- prosledi taj potez do pasivnog
    *** apdejtuj tabele
    <-- obavesti aktivnog o uspehu poteza (pogodio/nije)
    *** proveri win condition
    *** zameni aktivnog i pasivnog i furlaj u krug
 */

public class Server {

    private ClientHandler[] clients;

    public static void main(String[] args) {

    }

    private static void checkWinCondition() {
        throw new UnsupportedOperationException();
    }

    public void endGame() {
        throw new UnsupportedOperationException();
    }
}
