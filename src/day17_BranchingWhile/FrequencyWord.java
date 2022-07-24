package day17_BranchingWhile;

public class FrequencyWord {
    public static void main(String[] args) {
        String str="JavaklmluJavakmluuJava";

        int freq=0;

        while (str.contains("Java")) {
            str = str.replaceFirst("Java","");
            freq++;

        /*for (int i = 0; i < str.length()-3; i++) { // i: maximum value of i can be only 7, you have to subtract -3 to include the
            // last 4 character String in the calculation
            String include= str.substring(i,i+4);
            //System.out.println("include = " + include);

            if ( include.equals("Java")) {
                freq++;
            }
            */

        }
        System.out.println("freq = " + freq);

    }
}
