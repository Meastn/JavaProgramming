package day01_JavaIntro;

import Utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str = "This is not fair";

        StringUtility.printEachChar(str);

        System.out.println();
       // StringUtility.reverse(str);
        System.out.println(StringUtility.reverseAndMakeSentence(str));

    }


}

