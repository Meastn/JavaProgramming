package day28_ArrayList.Week08;

public class ArraysLoopWConditions_PROBLEM {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 45.0, 34.4, 54.0, 23.0};
        String[] items = {"book", "brochure", "poster", "booklet", "folder", "pencil", "eraser"};
        int count = 0;
        int itemIndex = 0;
        System.out.println("---prices that are more than 40 $ ---");
        // PROBLEM : instead of running the outer loop once for each element it runs for 7 times.
        for (int i = 0; i < prices.length - 1; i++) {

            for (double itemPrice : prices) {
                if (itemPrice >= 40.0) {
                    count++;
                }

            }

            //System.out.println(items[i] + ": " + prices[i] + " $");
        }

        System.out.println("Items pricer than 40 $ = " + count + " items.");
    }
}
