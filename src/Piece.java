/**
 * Thanawat Potidet
 * 6510450445
 * */
public class Piece {
    private Square location;

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }

    public String getName(){
        return location.getName();
    }
}
