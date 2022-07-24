package day17_BranchingWhile;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("while-------");
        int count=1;
        while (count <= 10) {

            System.out.println(count);
            count++;
        }
        System.out.println("do While-------");
        int num=1;
        do {
            System.out.println(num);
            num++;
        } while (num <= 10);

    }
}
