package day14_Strings;

public class StringMethod2 {
    public static void main(String[] args) {

        // replace (oldValue, newValue)
        String str = "Java is fun. I love learning Java";
        System.out.println("Before replacement: " + str);
        str = str.replace("Java", "PHP");
        System.out.println("After replacement: " + str);

        String email = "JohnSmith@yahoo.com";
        System.out.println("old email = " + email);
        email = email.replace("@yahoo.com", "@gmail.com");
        System.out.println("new email = " + email);
        String remove = "Java Phython PHP C# C# Phython Java";
        System.out.println("remove = " + remove);
        remove = remove.replace("Phython", "");
        remove = remove.replace("  ", " ");
        System.out.println("remove = " + remove);
    }
}
