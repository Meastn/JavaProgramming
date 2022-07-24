package day25_CustomMethods_Overloading;

public class MethodOverloadPractice {

    public static void main(String[] args) {
        System.out.println("--------Maximum integer------------");
        int num1=10, num2=31;
        System.out.println(MaxNumber.returnMaximum(num1, num2));
        System.out.println("--------Maximum Double------------");
        double num3=1.7, num4=3.7;
        System.out.println(MaxNumber.returnMaximum(num3, num4));
        System.out.println("--------Maximum long------------");
        long num5=100, num6=200;
        System.out.println(MaxNumber.returnMaximum(num5, num6));
        System.out.println("--------Maximum short------------");
        short num7=70, num8=60;
        System.out.println(MaxNumber.returnMaximum(num7, num8));
        System.out.println("--------Maximum byte------------");
        byte num9=43, num10=56;
        System.out.println(MaxNumber.returnMaximum(num9, num10));
        System.out.println("--------Maximum float------------");
        float num11=67, num12=69;
        System.out.println(MaxNumber.returnMaximum(num11, num12));
    }
}
