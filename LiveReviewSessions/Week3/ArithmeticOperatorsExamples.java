package Week3;

public class ArithmeticOperatorsExamples {

    public static void main(String[] args) {

        // you  should pay attention to the data types
        System.out.println("Adding a (double) statement before:" + (double)(10/3));
        // java considers 10 and  3 as integers which results with another integer which is 3
        // int/int will give you an int result
        System.out.println("Writing numbers as 10/3.0: " + 10/3.0);
        // you can put a (double) statement before the calculation or
        // you can write one of the numbers not as an integer but as a decimal
        System.out.println("Writing numbers as 10.0/3: " + 10.0/3);
        
        int leftover = 17%3; // you can assign the result of an operator directly to a variable
        System.out.println("leftover = " + leftover);

    int outcome = 3+4*4+5*(4+3)-1;
        System.out.println("outcome = " + outcome);

        int x=46, y=90;
        int z=x+y;
        System.out.println("z = " + z);

        /* write a program that converts centigrate to fahrenheit
        formula is
            (C*1, 8+32) = F

         */
        double tempInCelcius, tempInFahrenheit;
        tempInCelcius       = 70.2;
        tempInFahrenheit = tempInCelcius*1.8+32;
        System.out.println("tempInCelcius = " + tempInCelcius);
        System.out.println("tempInFahrenheit = " + tempInFahrenheit);



    }
}
