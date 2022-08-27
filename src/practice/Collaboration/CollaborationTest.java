package practice.Collaboration;

import day20_Arrays.CrossOperation_byMelih;

public class CollaborationTest  {

    public static void main(String[] args) {

        CollaborationTest test2 = new CollaborationTest();
        test2.dontTry();
        test2.tryAgain();
    }

    public   void dontTry()  { // THIS IS THE MAIN PROBLEM
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("hello");
    }

    public void tryAgain()  {
             CollaborationTest test = new CollaborationTest();
             test.dontTry();
        }

    }
