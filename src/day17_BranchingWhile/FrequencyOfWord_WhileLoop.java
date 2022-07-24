package day17_BranchingWhile;

import java.util.Scanner;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        // Scanner scan= new Scanner (System.in);
        String str=" Java Java Hava Mava Kava Java Lava";
        int frequency =0;

        while (str.contains("Java")) {
            str = str.replaceFirst("Java","");
            frequency ++;
            System.out.println("remaining string = " + str);
        }
        System.out.println("frequency = " + frequency);

        System.out.println("-------------------");
        
        String sentence = "cat cat dog cat dog dog cat cat dog cat catdog dog cat";
        int repeatence =0;
        sentence.toLowerCase();

        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat","");
            repeatence ++;
        }
        System.out.println("repeatence = " + repeatence);

    }
}
