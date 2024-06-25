import java.util.ArrayList;
/**
 * Thanawat Potidet
 * 6510450445
 * */
public class Board {

    private ArrayList<Square> squares;

    public Board() {
        squares = new ArrayList<>();
        createSquareOnBoard();
    }

    private void createSquareOnBoard() {
        for(int i = 0; i < 40; i++) {
            squares.add(new Square("squares: " + i));
        }
    }

    public Square getSquare(Square location, int fvTot){
        int index = squares.indexOf(location);
        return squares.get((index + fvTot) >= 40 ? (index + fvTot) % 40 : index + fvTot);
    }
}
