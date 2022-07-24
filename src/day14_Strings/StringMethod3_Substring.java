package day14_Strings;

public class StringMethod3_Substring {
    public static void main(String[] args) {
        String word =        "These days it is hard to hold On";
        System.out.println  ("0123456789012345");
        String str1 = word.substring(6);

        System.out.println("str1 = " + str1);
        String str2 = word.substring(word.indexOf("se"), word.lastIndexOf("ld"));
        System.out.println("str2 = " + str2);
        String str3 = word.substring(7,11);
        System.out.println("str3 = " + str3);
        String str4 = word.substring(word.indexOf(" "), word.lastIndexOf(" "));
        System.out.println("str4 = " + str4);
        System.out.println(word.substring(word.lastIndexOf(" ")));

    }
}
