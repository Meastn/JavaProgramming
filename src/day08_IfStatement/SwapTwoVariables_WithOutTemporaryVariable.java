package day08_IfStatement;

public class SwapTwoVariables_WithOutTemporaryVariable {

    public static void main(String[] args) {
        int a=10;
        int b=15;

        a = (b-a) + (b-a) + (b-a);
        System.out.println("a = " + a);
        b= (b-a) + (b-a);
        System.out.println("b = " + b);

        System.out.println("bla bla" + (5 + 3));

        int x=3, y=2;
        long z = (x+y)*2/3%2;
        System.out.println((int)(10.0/3));
    }
}
