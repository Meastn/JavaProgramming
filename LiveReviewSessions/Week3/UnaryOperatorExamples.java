package Week3;

public class UnaryOperatorExamples {

    public static void main(String[] args) {
        int z,y;
        z= 2;
        y= z++;
        System.out.println("y = " + y);
        System.out.println("x = " + z);

        int x=50;
        x = --x + x++ + --x + ++x;
        System.out.println("a = " + x);
        System.out.println(49 + 49 + 50 + 49);
        // 49 -> 49 -> 50 -> 49

        int a=1;
        a = -a-- + a++ / -a-- * --a;
       // first do the multiplification
        // a = xxxxxxxxx  / -1 * -3 = 3
        // then the division
        // a = xxxxx + -3 / 3 = 1
        // then the addition
        // -2 + 1 = -1

        int b;
        b = -3 / 3;
        // -1 -> -2 -> 2 *
        System.out.println("b = " + b);


    }
}
