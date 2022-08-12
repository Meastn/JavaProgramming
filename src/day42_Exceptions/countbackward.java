package day42_Exceptions;

import Utilities.Timer;

public class countbackward {
    public static void main(String[] args) {
        for (int i = 7200; i >= 0; i--) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print("\r" + i );
        }
    }
}
