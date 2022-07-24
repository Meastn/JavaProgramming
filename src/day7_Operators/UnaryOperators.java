package day7_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1=25;
        int num2=-25;

        System.out.println(num1<num2); //false
        System.out.println(num1<0); //false

        System.out.println("-----------");
        
        int a=5;
        System.out.println("a = " + a);
        ++a;
        System.out.println("increase a by one = " + a);
        --a;
        System.out.println("decrease a by one= " + a);
        System.out.println("------------");
        int c = 100;
        System.out.println(c++); // post increment
        System.out.println(c);
        System.out.println( ++c + c++);
        System.out.println("------");

        int y=200;
        System.out.println(y++);
        System.out.println(y);
        System.out.println(y++);


        int k=40;
        System.out.println(++k); //preincrement immidiate value = 41, next value =41
        System.out.println(k++); //postincrement immidiate value = 41, next value = 42
        System.out.println(k); // immidiate value =42

        int m = 20;
        System.out.println(--m); // immidiate value = 19, next value =19
        System.out.println(m--); // immidiate value = 19, next value =18
        System.out.println(m); // immidiate value = 18
    }
}
