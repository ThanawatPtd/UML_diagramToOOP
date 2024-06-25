import java.util.List;
/**
 * Thanawat Potidet
 * 6510450445
 * */
public class Player {
    private List<Die> dies;
    private String name;
    private Piece piece;
    private Board board;

    public Player(String name) {
        this.name = name;
        this.piece = new Piece();
    }

    public void takeTurn(){
        int fv =0;

        for(Die die: dies){
            die.roll();
            fv += die.getFaceValue();
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fv);
        piece.setLocation(newLoc);
    }

    public void setDies(List<Die> dies) {
        this.dies = dies;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Piece getPiece() {
        return piece;
    }
}
