package day08_IfStatement;

public class IdentifyNumber {
    public static void main(String[] args) {

        int number = 200;
        boolean isPositive = number>0;
        boolean isNegative = number>0;
        boolean isEqual = number==0;
        System.out.println(number + " is a positive number: " + isPositive);
        System.out.println(number + " is a negative number: " + isNegative);
        System.out.println(number + " is zero: " + isEqual);

    }
}
