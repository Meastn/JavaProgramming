package day14_Strings;

public class StringMethod4 {
    public static void main(String[] args) {
        String str = "\"Cydeo\"\t ";
        String str2 = str.repeat(10);
        System.out.println("str = " + str2);
        System.out.println("Impossible to count.\n".repeat(5));
        String str3= str.replace("Cydeo","bloph" );
        System.out.println("str3 = " + str3);
        System.out.println("str= " + (str + " ").repeat(5));
    }
}
