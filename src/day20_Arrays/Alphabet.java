package day20_Arrays;
import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char [] alphabets = new char[26];
    // variables   i    j/ch
        alphabets [0] = 'Z'; // ASCII value for Z is 90
        alphabets [1] = 'Y';// ASCII value for Z is 89
        alphabets [2] = 'X';// ASCII value for Z is 88

        char ch='Z';

        for (int i = 0; i < alphabets.length ; i++, ch--) {
            alphabets [i] = ch;
        }
        System.out.println(Arrays.toString(alphabets)); // converts the whole array into string and prints the whole array
        System.out.println(alphabets[0]); // prints the element defined in the specific index of the array


        }
    }

