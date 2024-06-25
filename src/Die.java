/**
 * Thanawat Potidet
 * 6510450445
 * */
public class Die {

    private int faceValue;
    void roll(){
        faceValue = (int)(Math.random()* 6)+1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
