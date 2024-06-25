import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Thanawat Potidet
 * 6510450445
 * */
public class MGame {
    private int roundCount;
    public ArrayList<Die> die;
    private Board board;
    private ArrayList<Player> playerList;

    public MGame(ArrayList<Player> playerList) {
        this.roundCount = 0;
        die = new ArrayList<Die>();
        die.add(new Die());
        die.add(new Die());
        this.board = new Board();
        this.playerList = playerList;
    }

    public void playGame(){
        for(Player player : playerList){
            player.setDies(this.die);
            player.setBoard(this.board);
        }
        for(roundCount = 0; roundCount < 50; roundCount++){
            playRound(roundCount);
        }
    }

    private void playRound(int roundCount){
        playerList.get(roundCount % count()).takeTurn();
    }

    public int count(){
        int count = 0;
        for(Player player : playerList){
            count++;
        }
        return count;
    }
}
