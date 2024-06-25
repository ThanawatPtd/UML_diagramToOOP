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
        try {
            MGame mGame = new MGame(players);
            mGame.playGame();
            for (Player p : players) {
                System.out.println(p.getName() + " is at square " + p.getPiece().getName());
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
