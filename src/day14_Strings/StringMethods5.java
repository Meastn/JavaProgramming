package day14_Strings;

public class StringMethods5 {
    public static void main(String[] args) {
        String m1 = "CYDEO";
        String m2 = "cydeo";

        System.out.println("Compare with ignoring case: " + m1.equalsIgnoreCase(m2));
        System.out.println("Compare without ignoring case: " + m1.equals(m2));
        System.out.println("Directly comparing two Strings: "+ "yEs".equalsIgnoreCase ("YES"));
        System.out.println("Hello. This is Mars speaking".contains("Mars"));

        String sentence = "If I wanted to learn a programming language, it would be Java";

        Boolean result = sentence.toLowerCase().contains("java");
        System.out.println("Does the sentence contains \"java\"? " + result);
        String s1 = " I love Java";
        String s2 = "Java";
        System.out.println(s1.contains(s2));


    }
}
