package day08_IfStatement;

public class EvenlyDivisible {
    public static void main(String[] args) {

        int number = 65;

        Boolean divisibleBy2 = 65 % 2 == 0;
        Boolean divisibleBy3 = 65 % 3 == 0;
        Boolean divisibleBy5 = 65 % 5 == 0;
        System.out.println(number + " is divisible by 2: " + divisibleBy2);
        System.out.println(number + " is divisible by 3: " + divisibleBy3);
        System.out.println(number + " is divisible by 3: " + divisibleBy5);
        /*
        My solution the long way
        System.out.println("Given number is: " + number);
        number %= 2;
        Boolean result1= number == 0;
        System.out.println("65 is divisible by 2: " + result1);
        number = 65;
        number %= 3;
        result1= number == 0;
        System.out.println("65 is divisible by 3: " + result1);
        number = 65;
        number %= 5;
        result1= number == 0;
        System.out.println("65 is divisible by 5: " + result1);
*/

    }
}
