package LiveReviewsEU9.week14.avengers;

import java.util.ArrayList;

public class TJMaxx {
    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */

    private ArrayList<Item> items;  // this an Arraylist Object, that holds objects of Item Type
    private ArrayList<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx(ArrayList<Item> items, ArrayList<OnSaleItem> onSaleItems) {
        this.items = items;
        this.onSaleItems = onSaleItems;
    }

    /*
    public TJMaxx() {

        this.items = new ArrayList<Item>();
        this.onSaleItems = new ArrayList<OnSaleItem>();
    }
         */

    /**
     * adds an item object to regularItems list
     * @param nameOfItem
     */

    public void addItem(Item nameOfItem){
        items.add(nameOfItem);
    }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item){
        onSaleItems.add(item);
    }

    /**
     * getter for regularItems
     * @return
     */

    public ArrayList<Item> getItems(){return this.items;}

    /**
     * getter for onSaleItems
     * @return
     */

    public ArrayList<OnSaleItem> getOnSaleItems(){return this.onSaleItems;}

    /**
     * return count of regularItem object
     * @return
     */


    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */


    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */


    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */


    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */


    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */


    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */

}