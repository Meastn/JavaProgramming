package day15_ForLoop;

public class StarPattern {
    public static void main(String[] args) {

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
