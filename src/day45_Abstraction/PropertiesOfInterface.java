package day45_Abstraction;

public interface PropertiesOfInterface {

    int a = 0; // since interface variables are static and finl
    // you have to immediately initialize them.
    static int b = 0;
  /*
    public PropertiesOfInterface (int a){
        this.a=a;
    }

    static {
        b=100;
    }

    public void method(){
        System.out.println("Instance method");
    }
    */

    public static void method2(){
        System.out.println("Static method");
    }
    public abstract void method3();

    default void method5(){
        System.out.println("Default method");
    }
}
