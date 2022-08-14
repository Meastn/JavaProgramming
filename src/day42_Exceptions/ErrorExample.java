package day42_Exceptions;

public class ErrorExample {

    public static void main(String[] args) {
        try {
            deadlyMethod();
        } catch (StackOverflowError e) {
            System.out.println("");
            System.out.println(e.getClass());

        }
    }


static int counter=0;
public static void deadlyMethod(){
    System.out.println(counter++);
    deadlyMethod();
}
}
