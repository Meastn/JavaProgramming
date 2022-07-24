package Replit;
import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();
        //YOUR CODE HERE

        int oddMiddle = word.length() / 2;
        int evenMiddle = word.length() / 2;


        if (word.length()%2 > 0 && word.length()>=3) {
            System.out.println(word.charAt(oddMiddle) );
        } else if (word.length()%2 ==0 && word.length()>=4) {
            System.out.println(word.substring(evenMiddle-1, evenMiddle+1));
        } else if (word.length() ==1){
            System.out.println(word.repeat(3));
        } else {
            System.out.println(word.repeat(2));
        }
    }
}
/*

You have a word, do the following:

When word has odd number of characters and
3 or more characters, print middle letter
oak ==> a
javav ==> v
Single character, print that character 3 times
# ==> ###
q ==> qqq
When word has even number of characters and:
4 or more characters, print the middle 2 characters
java ==> av
apples ==> pl
#$%^&* ==> %^
2 characters, print those 2 characters twice
@@ ==>@@@@
$$ ==>$$$$
hi ==> hihi
 */



