package day17_BranchingWhile;

import java.sql.SQLOutput;

public class DoWhileIntro {
    public static void main(String[] args) {
        boolean a=false;
        for (int i = 0; a;) {
            System.out.println("Wooden Spoon-for loop");
        }
        System.out.println("--------");
        while(a){
            System.out.println("Wooden Spoon-while loop");
        }
        System.out.println("--------");
        do {
            System.out.println("Wooden Spoon-do-while loop");
        } while (a);

    }
}
