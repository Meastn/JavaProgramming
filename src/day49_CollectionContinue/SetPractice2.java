package day49_CollectionContinue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class SetPractice2 {
    public static void main(String[] args) {

        String str = "eeeeeaaaaabbbcccccccccddeeeeee";

        // eabcd e
        // 54392 6


        String result = ""; //e5a4b3c9d3

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result += each + Collections.frequency(Arrays.asList(str.split("")), each);
        }

        System.out.println(result);
    }

}
