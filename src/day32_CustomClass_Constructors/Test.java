package day32_CustomClass_Constructors;

public class Test {

    public Test (){
        System.out.println("A");
    }

    public Test (int a){
        this();
        System.out.println("B");
    }

    public Test (double a){
        this(10);
        System.out.println("C");
    }
    public Test (String str){
        this(10.5);
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Test (10);

        System.out.println("------");
        new Test ("hello");
        System.out.println("------");

    }
}
