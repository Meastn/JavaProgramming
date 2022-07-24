package day28_ArrayList.Week08;

public class ArraysBasic {

    public static void main(String[] args) {

        String [] items= {"Shoes","Jacket", "Gloves","Airpods","iPad","iPhone Case"};
        double [] prices = {99.99,350.50,9.99,250.0,439.50,39.99};
        int [] itemIDs= {12345, 124346, 12347,12348,12349,12350};

        /*
        Find the item which is most expensive and capture
        ItemId, index in the list, price: print all
        when you get question about MAX and MIN values
        always start with an assumption
        You need to compare two items so you can find
        which is bigger
         */
double maxPrice = prices[0];
int indexOfMaxPrice = 0;
double minPrice= prices [0];
int indexOfMinPrice =0;
String itemName ="";
int itemID=0;
        for (int i = 0; i <prices.length ; i++) {

            if (prices [i] > maxPrice) {
                maxPrice = prices [i];
                itemName     = items [i];
                itemID = itemIDs [i];
                indexOfMaxPrice = i;
            }
            if (prices [i] < minPrice) {
                minPrice = prices [i];
                itemName     = items [i];
                itemID = itemIDs [i];
                indexOfMinPrice=i;
            }

        } System.out.println("Maximum priced item in our store is " + itemName + " with a price of " + maxPrice + " Item ID is: " + itemID);
        System.out.println("Minumum price item in our store is " + itemName + " with a price of " + minPrice + " Item ID is : " + itemID);

    }
}
