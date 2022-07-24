package day24_Custom_Methods_Return_Method;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aaaddduuukkklllbbcc"; // "abc
        // Create a method that can remove duplicate characters from a string and return the value

        System.out.println("With duplicates = " + str);
        str = removeDuplicates(str);

        System.out.println("Duplicates removed = " + str);
    }

    public static String removeDuplicates(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }

        }
        return result;
    }


}
