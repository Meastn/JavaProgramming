package day24_Custom_Methods_Return_Method;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        String str ="Apapa";
        // reverse (str);
        String endResult = reverse (str);
        System.out.println(endResult);

        if(str.equalsIgnoreCase(endResult)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }

    }

    public static String reverse(String str) { // "Java"
        String result ="";
        for (int i=str.length()-1; i>=0; i-- ) {
            result += str.charAt(i);
        }

        return result;

    }
}
