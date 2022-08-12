package day42_Exceptions;

import Utilities.Timer;

public class DisadvantageOfThrowKeyword  {

    public static void main(String[] args) throws InterruptedException{
        sleep(2.5); // who ever calls the throws should also have the throw keyword

    }
    public static void sleep (double seconds) throws InterruptedException{
            Thread.sleep((long) (seconds * 1000));
    }
}
