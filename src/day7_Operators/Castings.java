package day7_Operators;

public class Castings {

    public static void main(String[] args) {

        float averageScore = 23.06F;
        byte num1 = (byte) averageScore;
        short num2 = (short) averageScore;
        long num3 = (long) averageScore;
        int num4 = (int) averageScore;
        float num5 = (float) averageScore;
        double num6 = (double) averageScore;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("-------");
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);

    }
}
