package day08_IfStatement;

public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        //-----------
        int c=b;
        b=a;
        System.out.println("b = " + b);
        a=c;
        System.out.println("a = " + a);
        System.out.println("----");


        //----------
        System.out.println("Old Values were:");
        System.out.println("a = " + a); //15
        System.out.println("b = " + b); //10

    }
}

/*
Write a program that can swipe two variables' value by using a temporary variable

ex:
if a=10, b=15

output:
a=15
b=10
 */