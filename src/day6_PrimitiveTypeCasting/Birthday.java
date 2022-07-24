package day6_PrimitiveTypeCasting;

import java.sql.SQLOutput;

public class Birthday {
    public static void main(String[] args) {
/* name, birthday (int), birthMonth (String), birthYear (int)
        use concatenation to display the birthday of a person

        if name = "John"
           birthday = 25
           birthMonth = "April"
           birthYear = 1995;

           output:
            John was born on April/25/1995

 */
            String name = "John";
            int birthday = 25;
            String birthMonth = "April";
            int birthYear = 1995;
            String bookname = "Butterfly";

        System.out.println(name + " was born on " + birthMonth + "/" + birthday + "/" + birthYear);
        System.out.println("--------------------------------------");
        System.out.println("My favorite books' name is : " + "\""+ bookname + "\"");



    }
}
