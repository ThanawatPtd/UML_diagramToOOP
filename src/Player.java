import java.util.List;
/**
 * Thanawat Potidet
 * 6510450445
 * */
public class Player {
    private List<Die> dice;
    private String name;
    private Piece piece;
    private Board board;

    public Player(String name) {
        this.name = name;
        this.piece = new Piece();
    }

    public void takeTurn(){
        int fv =0;

        for(Die die: dice){
            die.roll();
            fv += die.getFaceValue();
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fv);
        piece.setLocation(newLoc);
    }

    public void setDice(List<Die> dice) {
        this.dice = dice;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Piece getPiece() {
        return piece;
    }

    public String getName() {
        return name;
    }
}
