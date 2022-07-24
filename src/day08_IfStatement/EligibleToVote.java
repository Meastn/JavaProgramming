package day08_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Joshua";
        int age = 43;
        String citizen = "UMA";
        boolean isElligible = age >= 21 && citizen == "USA";

        // Elligible
        if (isElligible) {
            System.out.println(name + " is elligible to vote");
        }
        // Not Elligible
        if (!isElligible){
            System.out.println( name + " is not elligible to vote");
        }
    }
}
