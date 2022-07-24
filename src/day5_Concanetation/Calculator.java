package day5_Concanetation;

public class Calculator {
    public static void main(String[] args) {

        int firstNumber = 100;
        int secondNumber = 50;
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiply = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + addition);
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiply);
        System.out.println(firstNumber + " / " + secondNumber + " = " + division);
    }
}
