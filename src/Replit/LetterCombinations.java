package Replit;

public class LetterCombinations {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        String str1="zyxwv";
        String str2="zyxwv";
        char ch1=0;
        char ch2 = 0;

        String result ="";

        for (int i=0; i<= str1.length()-1; i++) {
            ch1 = str1.charAt(i);
            for (int j=0; j<= str2.length()-1;j++)   {
                ch2= str2.charAt(j);
                result = ""+ ch1+ch2;
                System.out.println(result);
            }

        }



    }
}