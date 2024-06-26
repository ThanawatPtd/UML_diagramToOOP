/**
 * Thanawat Potidet
 * 6510450445
 * */
public class Die {

    private int faceValue;
    private int[] availableFaces;

    public Die() {
        faceValue = 1;
        availableFaces = new int[6];
        for (int i = 0; i < 6; i++) {
            availableFaces[i] = i + 1;
        }
    }

    public void roll(){
        faceValue = availableFaces[(int)(Math.random()* 6)];
    }

    public int getFaceValue() {
        return faceValue;
    }
}
