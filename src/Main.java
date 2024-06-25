import java.util.ArrayList;
/**
 * Thanawat Potidet
 * 6510450445
 * */
public class Main {
    public static void main(String[] args) {
        Player player = new Player("Peak");
        Player player2 = new Player("Ohm");
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player);
        players.add(player2);
        MGame mGame = new MGame(players);
        mGame.playGame();
        for (Player p : players) {
            System.out.println(p.getPiece().getName());
        }
        }
    }