package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {
        int numberOfDay=9;
        String nameOfDay ="";

        switch (numberOfDay){ // need to compare with 1,2,3,4,5,6,7 Can only be used to compare with ==
            case 1:
                System.out.println( "Monday");
                break; // exits the xwitch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid Entry");
                // you dont have to break the switch is your default is at the end of the chain, next } will close it either way
        }


    }
}
