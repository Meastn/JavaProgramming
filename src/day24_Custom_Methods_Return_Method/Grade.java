package day24_Custom_Methods_Return_Method;

public class Grade {
    public static void main(String[] args) {

        String str = grade(95);
        System.out.println(str);

        String conclude = (str.equals("A")) ? "Excellent" : (str.equals("B")) ? "Great"
                : (str.equals("C")) ? "Good" : (str.equals("D")) ? "OK" : (str.equals("E")) ? "Pass"
                : (str.equals("F")) ? "Fail" : "invalid";

        System.out.println(conclude);
    }

    public static String grade(int score) {
        String result = "";
        if (score < 0 || score > 100) {
            result = "Invalid";
        } else {
            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C"
                    : (score >= 60) ? "D" : (score >= 50) ? "E" : (score <= 49) ? "F" : "Invalid";
        }
        return result;


    }
}

// create a function that can calculate the grade and return it for further processes
// check the grade
//        'A' = "Excellent"
//        'B' = "Great"
//        'C' = "Good"
//        'D' = "