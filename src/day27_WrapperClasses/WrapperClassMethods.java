package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str ="1234567";
        System.out.println(str + 1); // adds a 1 after the last char of the string, no calculations
        int num= Integer.parseInt(str);
        System.out.println(num+1); // after parsing to a Integer wrapper class now  you can do calculations
        String str2 ="10.3";
        double num2 = Double.parseDouble(str2);
        System.out.println(num2*2);
        System.out.println(Integer.max(430,20));
        int max = Integer.MAX_VALUE;
        System.out.println("Maximum integer in java: " + max);
        int min = Integer.MIN_VALUE;
        System.out.println("Minimum integer in java: " + min);
        System.out.println("-------------");
        long max1 = Long.MAX_VALUE;
        System.out.println("Maximum long in java: " + max1);
        long min1 = Long.MIN_VALUE;
        System.out.println("Minimum long in java: " + min1);
        System.out.println("-------------");
        double max3 = Double.MAX_VALUE;
        System.out.println("Maximum double in java: " + max3);
        System.out.println("-------------");
        String condition = "true"; // convert a string contaning true or false words to a boolean primitive. If it contains
        // other words it will always give false.
        boolean r1 = Boolean.parseBoolean(condition);

        System.out.println("----VALUEOF METHOD-----"); // converts String to Wrapper Class unlike parsing
        //converting prmitive to a Wrapper class
        // parse returns
        String str4= "123";
        Integer x= Integer.valueOf(str4); // returns an Integer and can be assigned to an Integer variable
        int y = Integer.valueOf(str4); // unboxing

        // CHARACTER WRAPPER CLASS HAS LOTS OF USEFUL METHODS
        // 1. isDigit () method
        char ch1= '0';
        boolean r2= Character.isDigit(ch1); // it checks if the character is a letter or a number
        System.out.println("is a number: " + r2);
        char ch2='L';
        boolean r3= Character.isLetter(ch2); //  checks if the character is a letter
        boolean r31 = Character.isUpperCase(ch2); // checks if the char is upper case
        System.out.println("is a letter: " + r3);
        System.out.println("is upper letter: " + r31);
        char ch3='@';
        boolean r4=!Character.isLetterOrDigit(ch3); // this can check if the char is a special character
        System.out.println("is a special character: " + r4);
        System.out.println("---------");
        // HOW TO CALCULATE NUMBERS EMBEDDED WITHIN A STRING
        String s= "ab1cde2efg3hi4"; // STRİNG
        int sum =0; // the result of calculation
       for (char each : s.toCharArray()) { // converts the String into a CHAR ARRAY
               if (Character.isDigit(each)) { // finds the digits in the CHAR ARRAY
                   sum += Integer.parseInt(""+ each); // if it is a digit it adds it into the sum, while it converts it
                   // from a char to an Integer for calculation. otherwise it can not calculate char digitis(THEY ARE
                   // STILL IN A CHAR ARRAY THUS THEY ARE CHARS.
                   // ALSO SINCE parseInt is a String method we convert the each as a CHAR by adding "" infront
               }
       }
        System.out.println("sum = " + sum);
    }
}
