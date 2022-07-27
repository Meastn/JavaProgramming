package day34_Static_Garbage_Collection;

public class AccessModifiers {

    public static int publicData = 100; //
    static int defaultData = 200; // no access modifier (default) dont use default keyword for access modifying it is for something else
    private static int privateData =300;

    public static void method1(){
        System.out.println("public method");
    }

    static void method2(){
        System.out.println("default method");
    }

    private static void method3(){
        System.out.println("private method");
    }
}
