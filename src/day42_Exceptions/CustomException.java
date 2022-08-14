package day42_Exceptions;

public class CustomException {
    public static void main(String[] args) {
       int c=55;
        System.out.println("The class is 50 minutes");
        if (c>50){
            throw new BreakTimeException("The time is over.");
        }

    }



}
