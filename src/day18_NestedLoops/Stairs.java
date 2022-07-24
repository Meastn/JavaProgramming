package day18_NestedLoops;

public class Stairs {
    public static void main(String[] args) {
        String star="*";
        String result="";
        int count=0;
        for (int i = 0; i < 10; i++) {
            System.out.println(star.repeat(i));

        }
    }
}

/*
Use a nested loop to print the following shape
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * * * *
* * * * * * * * *
* * * * * * * * * *
 */