package day08_IfStatement;
import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your grade?: ");
        int score = scan.nextInt();
        scan.close();

        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && !a;
        boolean c = !a && !b && score >=70;
        boolean d = score >=60 && score <=69;
        boolean e = score >=0 && score <=59;

        if (a) { // if the student made an A
            System.out.println("Excellent");
        }
        if (b) { // if the student made a B
            System.out.println("Great");
        }
        if (c) { // if the student made a C
            System.out.println("Good");
        }
        if (d) { // if the student made a D
            System.out.println("Passed");
        }
        if (e) { // if the student made an E
            System.out.println("Failed");
        }

    }
}

/*
score :
    90 ~ 100  ==> Excellent
    80 ~ 89  ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed
5 separate outcomes

 */