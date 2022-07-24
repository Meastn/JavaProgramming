package day20_Arrays;
import java.util.Arrays;

public class AppearTwice {
    public static void main(String[] args) {
        char [] chars = {'A', 'B', 'A', 'C', 'A', 'B', 'C'};

        for (int j = 0; j < chars.length; j++) {
            int frequency =0;
            char ch = chars[j];

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ch) {
                    frequency ++;
                }
            }
            if (frequency ==2) {
                System.out.println(ch);

            }
        }



    }
}
