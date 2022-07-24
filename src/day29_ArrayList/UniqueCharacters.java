package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabbccdeefghiiij";
        // We can not create an ArrayList out of a String directly
        // First you need to create a non-primitive Array out of the string
        // you can not use tocharArry because it will create a primitives array
        // instead we can call the SPLIT method


        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list);

        String unique = "";

        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            if (frequency == 1) {
                unique += each; // we are reassigning unique characters back to a STRING ARRAY
            }
        }
        System.out.println("unique = " + unique);


    }
}
