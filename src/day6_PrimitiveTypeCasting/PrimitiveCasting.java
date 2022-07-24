package day6_PrimitiveTypeCasting;

public class PrimitiveCasting {

    public static void main(String[] args) {

        byte a = 100;
        short b =a; // implicit casting from byte to short
        int c = b; // implicit casting from short to int
        long d = c; // implicit (automatic) casting from int to long
        float  e = d;
        double f = e;


        System.out.println("short type variable b = " + b);
        System.out.println("int type variable c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("_____________________");

        int x = 55;
        short y = (short) x; // explicit casting done manually and casts a bigger value to a lower data type
        long j = 10000000;
        short k = (short) j;
        byte m = (byte) k;

        System.out.println(y + " : "  + y);
        System.out.println(j + " : " + k);
        System.out.println(k + " : " + m);
    }

}
