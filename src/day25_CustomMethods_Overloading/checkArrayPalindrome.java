package day25_CustomMethods_Overloading;
import Utilities.StringUtility;

public class checkArrayPalindrome {
    public static void main(String[] args) {

        String[] nameList = {"Anna", "Jack", "racecar", "Mom", "Cydeo"};

        int count = 0;

        for (String each:nameList){
            if (StringUtility.isPalindrome(each)){
                count ++;
            }
             }
        System.out.println(count);
    }
}
