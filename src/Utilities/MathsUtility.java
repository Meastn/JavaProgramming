package Utilities;

public class MathsUtility {

    // A. RETURN THE SUM OF TWO NUMBERS
    // (1) return the sum of two integers
    public static int sumOfTwoNumbers(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    // (2) return the sum of two decimals
    public static double sumOfTwoNumbers(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    // (3) return the subtraction of two integers
    public static int subtractTwoNumbers(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    // (4) return the subtraction of two decimals
    public static double subtractTwoNumbers(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    // (5) return the multiplication of two integers
    public static int multiplyTwoNumbers(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    // (6) return the multiplication of two decimals
    public static double multiplyTwoNumbers(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    // (7) pass two double parameters and return the division result
    public static double divideTwoNumbers(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }

    // (8) check if an integer is an even number
    public static boolean checkEvenNumber(int num1) {
        boolean result = false;
        if (num1 % 2 == 0) {
            result = true;
        }
        return result;
    }

    // (9) check if an integer is an odd number
    public static boolean checkOddNumber(int num1) {
        boolean result = false;
        if (num1 % 2 != 0) {
            result = true;
        }
        return result;
    }

    // (10) return the maximum between of two integers
    public static int returnMaximumNumber(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    // (11) return the maximum between of two integers
    public static double returnMaximumNumber(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    // (12) return the minimum between of two integers
    public static int returnMinimumNumber(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    // (13) return the minimum between of two integers
    public static double returnMinimumNumber(double num1, double num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    // (14) return the square of an integer
    public static int squareOfANumber(int num1) {
        int result = num1 * num1;
        return result;
    }

    // (15) return the square of a decimal
    public static double squareOfANumber(double num1) {
        double result = num1 * num1;
        return result;
    }

    // (16) return the square of an integer
    public static int cubeOfANumber(int num1) {
        int result = num1 * num1 * num1;
        return result;
    }

    // (17) return the square of a decimal
    public static double cubeOfANumber(double num1) {
        double result = num1 * num1 * num1;
        return result;
    }

}


