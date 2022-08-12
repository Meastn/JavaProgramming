package day42_Exceptions;

import Utilities.Timer;

public class ExceptionIntro {
    public static void main(String[] args)  {
        System.out.println("Push Up 1");

        for (int i = 1; i <= 30; i++) {
            Timer.sleep(0.4);
            System.out.print(" \r count " + i + " : Hello");

            }
        System.out.println("\n --------");
        System.out.println("Push Up 2");

    }
    }

