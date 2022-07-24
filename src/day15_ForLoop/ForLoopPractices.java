package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {
        int increment = 0;
        for (int i = 1; i <= 10; i += 2) {
            increment = increment + 1;
            System.out.print(" " + increment + ")" + i);
        }
        System.out.println();
        System.out.println("----------------");
        for (int i = 100; i >= 85; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("----------------");
        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.print(letter + " ");
        }
        System.out.println();
        System.out.println("----------------");
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.print(letter + " ");
        }
        System.out.println();
        System.out.println("----------------");
        for (char letter = 'Z'; letter >= 'A'; letter--) {
            System.out.print(letter + " ");
        }
        System.out.println();
        System.out.println("----------------");
        for (char letter = 'z'; letter >= 'a'; letter--) {
            System.out.print(letter + " ");
        }
        System.out.println();
        System.out.println("----------------");
        for (char ascii = 1 ; ascii <= 37 ; ascii ++) {
            System.out.print(ascii + " ");
        }
        System.out.println();
        System.out.println("----------------");

        for (int repeat =1; repeat<=8; repeat ++) {
            System.out.println();
            System.out.print("\t\t\t");
            for (char star = 1; star <= 6; star++) {
                System.out.print("\t*");
            }
        }
        System.out.println();

    }
}
