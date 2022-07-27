package day34_Static_Garbage_Collection;

public class StaticBlock_vs_Constructor {

    static {
        System.out.println("This is static Block");
    }

   public StaticBlock_vs_Constructor(){
        System.out.println("This is a Constructor");
    }


    public static void main(String[] args) {
        System.out.println("Main Method");

        new StaticBlock_vs_Constructor();
        new StaticBlock_vs_Constructor();
        new StaticBlock_vs_Constructor();
        new StaticBlock_vs_Constructor();
    }
}
