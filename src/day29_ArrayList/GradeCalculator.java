package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {
        ArrayList <Integer> scores = new ArrayList<>();
        scores.addAll (Arrays.asList(100,90,75,85,65,85,55,45,73,73,35));

        ArrayList<Integer> gradeOfA = new ArrayList<>(scores); // 90 -100
        gradeOfA.removeIf(p -> !(p>=90 && p <=100));
        System.out.println("gradeOfA = " + gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>(scores); // 90 -100
        gradeOfB.removeIf(p -> !(p>=80 && p <=89));
        System.out.println("gradeOfB = " + gradeOfB);

        ArrayList<Integer> gradeOfC = new ArrayList<>(scores); // 90 -100
        gradeOfC.removeIf(p -> !(p>=70 && p <=79));
        System.out.println("gradeOfC = " + gradeOfC);

        ArrayList<Integer> gradeOfD = new ArrayList<>(scores); // 90 -100
        gradeOfD.removeIf(p -> !(p>=60 && p <=69));
        System.out.println("gradeOfD = " + gradeOfD);

        ArrayList<Integer> gradeOfE = new ArrayList<>(scores); // 90 -100
        gradeOfE.removeIf(p -> !(p>=50 && p <=59));
        System.out.println("gradeOfE = " + gradeOfE);

        ArrayList<Integer> gradeOfF = new ArrayList<>(scores); // 90 -100
        gradeOfF.removeAll(gradeOfA);
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);
        gradeOfF.removeAll(gradeOfE);
        System.out.println("gradeOfF = " + gradeOfF);

    }
}
