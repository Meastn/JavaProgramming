package practice;

public class LiveClassPractices {
    public static void main(String[] args) {

        byte num1; // declaring var num1
        num1 = 123; // initializing, giving value to the var num1
        num1 = 84; // re-initializing, giving a new value to the var num1

        short num2=12345; // declaring and initializing the var num2 at the same line

        int distance = 1_000_000_000;
        long distanceMore = 3_000_000_000L; // for numbers that exceed the limits of int we have to put L at the end
        long distanceALittleBitMore = 2_000_000; // for long vars that do not exceed int limit you dont have put L at the end

        float rate = 1000.0F; // you have to put F at the end when declaring a float var
        double rateMore = 1000.0;

        System.out.println("----_Castings_----");
        num2 = num1; // lets assign num1 (byte) to num2 (short) data type and cast it
                    // this is implicit casting and it is okay
                    // num1 = num2 will not work since we are trying to cast a bigger data type to a smaller data type
        num1 = (byte)num2; // we call it explicit casting when we assign a smaller data type into a bigger one

        System.out.println("num1 = " + num1);

        char ch = 'a';
        System.out.println("ch = " + ch);

        int x = ch + 5;
        System.out.println("x = " + x);

        String str = ""+'J'+'a'+'v'+'a'; // if you dont put an empty "" the String will not take other chars and give an error
        System.out.println("str = " + str);


        int y= 'J'+'a'+'v'+'a';
        System.out.println("y = " + y); // chars can act as a numeric value derived from ASCII table and make numerical calculations

   // Important rule Java runs from top to bottom and left to right

        boolean b1 = true; // assign true/false conditions to a variable
        boolean b2=false;
        int bx1=5;
        int bx2=4;
        boolean result = bx1<bx2;
        System.out.println("result = " + result);

    }

}
