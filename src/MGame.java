import java.util.ArrayList;

/**
 * Thanawat Potidet
 * 6510450445
 * */
public class MGame {
    private int roundCount;
    public ArrayList<Die> dice;
    private final Board board;
    private final ArrayList<Player> players;

    public MGame(ArrayList<Player> playerList) throws IllegalArgumentException {
        this.roundCount = 0;
        dice = new ArrayList<>();
        dice.add(new Die());
        dice.add(new Die());
        this.board = new Board();
        this.players = playerList;
        if (this.players.size() < 2) {
            throw new IllegalArgumentException("There must be at least 2 players to start the game.");
        }
    }

    public void playGame(){
        for(Player player : players){
            player.setDice(this.dice);
            player.setBoard(this.board);
        }
        for(roundCount = 0; roundCount < 50; roundCount++){
            playRound(roundCount);
        }
    }

    private void playRound(int roundCount){
        players.get(roundCount % count()).takeTurn();
    }

    public int count(){
        int count = 0;
        for(Player player : players){
            count++;
        }
        return count;
    }
}
