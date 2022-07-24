package day09_IfStatements;

public class NumberToWord {
    public static void main(String[] args) {
        int number = 11;
        String word="";

        if (number == 1){
            word = "One";
        } else if (number == 2) {
            word = "Two";
        }else if (number == 3) {
            word = "Three";
        }else if (number == 4) {
            word = "Four";
        }else if (number == 5) {
            word = "Five";
        }else if (number == 6) {
            word = "Six";
        }else if (number == 7) {
            word = "Seven";
        }else if (number == 8) {
            word = "Eight";
        }else if (number == 9) {
            word = "Nine";
        } else {
            word="Invalid Entry";
        }
        System.out.println("word = " + word);
        }
    }

/*
Create a class called NumberToWord, and write a java program that can
convert numbers between 0 ~ 9 to words
Ex:
number = 1;
output:
One
 */