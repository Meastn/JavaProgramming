package day21_ArraysUtilityForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        String [] words = {"Java Programming" , "Cydeo School", "Wooden Spoon", "Early Bird", "Angry Birds"};

        for (String each : words) {
            System.out.print(""+ each.charAt(0) + each.charAt(each.length()-1) + ", "); // you have convert chars into a string
            // by adding a "" + at the beginning of the concatenation. Otherwise it will return strange numbers.


        }
    }
}
