package day19_LoopPractices;

public class AppearTwice {
    public static void main(String[] args) {
        String str = "Writee the number inn the string.";
        str = str.replaceAll(" ", "").toLowerCase();

        String result = "";

       // System.out.println("str = " + str);
       for (int i = 0; i < str.length(); i++) {
           char ch = str.charAt(i);
           int count = 0;
           for (int j = 0; j < str.length(); j++) {
                char control = str.charAt(j);
                if (ch == control) {
                    count++;
                }


            } if (count == 1 ) {
               continue;
           } else if (count >2 && count < 2) {
               continue;
           } else {
               result += ch;
           }


        }System.out.println(result);
    }


}


/*
Write a program that can display all the characters that appeared
twice in the string.
 */