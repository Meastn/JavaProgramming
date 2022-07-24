package practice;

public class CastingTryout {
    public static void main(String[] args) {

        double x = 12_000_000_0000.7;
        float y = (float) x;

        System.out.println("x the original value as long= " + x);
        System.out.println("y when converted to short= " + y);
    }
}

