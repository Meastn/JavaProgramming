package day20_Arrays;
import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char letters[] = new char[26];
        // char letters [] = {'a', 'b', 'c','d','e','f','g','h','i', 'j','k','l','m',
         //       'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (char i = 'A', j=0; i<= 'Z' && j<letters.length ; i++, j++) {

            letters [j] = i;

        }
        System.out.println("-----------");
        System.out.println(Arrays.toString(letters));
        char ch='A';
        for (int i = 0; i < letters.length ; i++, ch++) {
        letters[i]=ch;
        }
        System.out.println(Arrays.toString(letters));
        System.out.println("-----------");
        char letters2[] = new char[26];

        for (char i = 'Z', j=0; i>='A' && j<letters.length; i--, j++) {
            letters [j] =i;

        }
        System.out.println(Arrays.toString(letters));
    }

}
