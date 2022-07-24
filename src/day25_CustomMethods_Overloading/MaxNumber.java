package day25_CustomMethods_Overloading;

public class MaxNumber {

    public static int returnMaximum (int num1, int num2){
        int result = 0;
        if (num1>num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;

    }
    public static double returnMaximum (double num3, double num4){
        double result = 0.0;
        if (num3>num4) {
            result = num3;
        } else {
            result = num4;
        }
        return result;

    }
    public static long returnMaximum (long num5, long num6){
        long result = 0;
        if (num5>num6) {
            result = num5;
        } else {
            result = num6;
        }
        return result;

    }
    public static short returnMaximum (short num7, short num8){
        short result = 0;
        if (num7>num8) {
            result = num7;
        } else {
            result = num8;
        }
        return result;

    }
    public static byte returnMaximum (byte num9, byte num10){
        byte result = 0;
        if (num9>num10) {
            result = num9;
        } else {
            result = num10;
        }
        return result;

    }
    public static float returnMaximum (float num11, float num12){
        float result = 0;
        if (num11>num12) {
            result = num11;
        } else {
            result = num12;
        }
        return result;

    }
    

}

/*

1. create a method that can return the max number from an integer
array
2. create a method that can return the max number from double array
3. create a method that can return the max number from long array
4. create a method that can return the max number from short array
5. create a method that can return the max number from float array
6. create a method that can return the max number from byte array
 */