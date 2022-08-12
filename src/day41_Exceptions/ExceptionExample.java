package day41_Exceptions;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Test started");
        try{
            System.out.println(9/0);
            System.out.println("Try block");
        } catch (ArithmeticException exception) {
            System.out.println("Catch Block");
            System.out.println("Arithmetic Exception has occurred");
        }
        System.out.println("Test completed");
        System.out.println("-----------------------------");
        System.out.println("Test 2 started");

        int [] numbers ={1,2,3,4,5};
        try {
            System.out.println(numbers[200]);
            System.out.println("Try Block");
        } catch (RuntimeException e){
            System.out.println("Exception:" + e.getMessage());;
        }

        System.out.println("-----------------------------");
        System.out.println("Test 3 started");
        try {
            System.out.println("Cydeo".substring(2, 0));
            System.out.println(7/0);
        } catch (RuntimeException e) {

            System.out.println("Exception:" + e.getMessage());;
        }
        System.out.println("Test completed");
    }
}
