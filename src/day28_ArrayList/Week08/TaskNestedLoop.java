package day28_ArrayList.Week08;

public class TaskNestedLoop {
    public static void main(String[] args) {

        int rowCount = 6;
 /*
        1
        2    (+4)   6
        3    (+4)   7  (+3)     10
        4    (+4)   8  (+3)     11  (+2)     13
        5    (+4)   9  (+3)     12  (+2)     14  (+1)  15

         */
        for (int row = 1; row <=rowCount ;row++) {
            int value = row; // value variable holds the numbers to be printed each time loop repeats
            for (int col = 1; col <=row ; col++) {
                System.out.print( value + " ");
                value += rowCount-col; // pattern is with each row number next column is added as (row-column)
            }
            System.out.println();
        }

    }
}
// outer loop should handle rows
// inner loop should handle columns


/*
1

2   6

3   7    10

4   8   11  13

5   9   12  14  15

 */