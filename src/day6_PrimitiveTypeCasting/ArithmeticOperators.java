package day6_PrimitiveTypeCasting;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("12" + 2); // concatenation , it ony writes the values as 122
        System.out.println(12 + 2); // addition, adds the numbesr and display the result
        System.out.println(12 -2); // subtraction, subtracts the numbers and display the result
        System.out.println(12 * 2); // multiplification, multiply the numbers and display the result
        System.out.println("----------Divisions--------");
        System.out.println(12 /2 ); //division, divides the numbers and display the result
        System.out.println(12.4 / 2); //dividing with decimals. at least one of the numbers must be decimal to divide correctly.
        System.out.println(12 / 5); // if integers result with a decimal java can not display the correct result but give the first decimal
        System.out.println( 12d / 5); //or you can put a d or D in one of the numbers whicn tells java to write the result in decimal

        int a = 100;
        double b = a/6;
        double c = a/6d;
        double d = (double)a/6;
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("---------------");
        System.out.println( 100D); // write the result as a decimal
        System.out.println(100);
    }
}
