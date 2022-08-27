package practice;

public class PalendromeMethod {

    public static void main(String[] args) {
        String s1= reverse("HullabooP");
        System.out.println(s1);
        System.out.println( isPalendrome("KABBALABBAK"));
    }

    public static String reverse (String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static boolean isPalendrome (String str2){
        String result = reverse(str2);
        return result.equalsIgnoreCase(str2);
    }



}
