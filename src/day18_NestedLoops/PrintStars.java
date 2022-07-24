package day18_NestedLoops;

public class PrintStars {
    public static void main(String[] args) {
        String str = "*";
        int times = 0;
        while (times < 5) {
            times++;
            for (int i = 0; i < 10; i++) {

                System.out.print(str);
            }
            System.out.println("\t\t");
        }
    }
}
