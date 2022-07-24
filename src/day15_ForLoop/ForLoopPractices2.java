package day15_ForLoop;

public class ForLoopPractices2 {
    public static void main(String[] args) {

        for (int number = 1; number <=100; number ++) {
            if (number % 15 == 0) {
                System.out.print("HEM-ÜÇ-HEM-BEŞLE ");
            } else if (number % 3 == 0) {
                System.out.print("ÜÇLE ");
            } else if (number % 5 == 0) {
                System.out.print("BEŞLE ");
            } else {
                System.out.print (number + " ");
            }
        }
    }
}

/*
Write a method which prints out the numbers from 1 to 100 but for
numbers which are a multiple of both 3 and 5, print "FINRA" instead of the
number,  for numbers which are a multiple of 3, print "FIN" instead of the
number and for numbers which are a multiple of 5, print "RA" instead of
the number.
ex:
output:
1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 F
 */