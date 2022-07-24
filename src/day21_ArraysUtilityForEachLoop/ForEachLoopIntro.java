package day21_ArraysUtilityForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,50,60,70}; //

        for (int each : numbers) { // directly access to the elements in an array
            System.out.print(each + " kudos, ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length ; i++) { //access indexes of the elements rather than the elements themselves
            int eachElement = numbers [i];
            System.out.print(eachElement + " mudos, ");

        }
    }
}
