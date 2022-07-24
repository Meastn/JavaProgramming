package day11_Switch_Scanner;

public class Grade {

    public static void main(String[] args) {

        char ch='G';
        String result = "";

        switch (ch) {
            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result = "Great";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Pass";
                break;
            case 'F':
                result = "Fail";
                break;
            default:
                result = "Invalid Entry";
        }
        System.out.println("result = " + result);

        System.out.println("===========");

        switch (ch) { // we can not use Boolean operators other than == in switch. But we can emulate the same result by
            // the same result by passing each case that we want to group until we declare one of them with a statement
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'F':
                result = "Failed";
                break;
            default:
                result = "Invalid Entry";
        }
        System.out.println(result);
    }
}
