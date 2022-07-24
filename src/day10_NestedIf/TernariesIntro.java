package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {
        int n = 98;

        if (n%2 == 0) {
            System.out.println("Even");
        } else {
                System.out.println("Odd");
            }
        System.out.println("=====");
        System.out.println((n%2==0)? "Evenk" : "Odd");;
        System.out.println("=====");
        int m=0;
        System.out.println((m>0)? "Positive" :(m<0)? "Negative" : "Zero");

        }
    }

