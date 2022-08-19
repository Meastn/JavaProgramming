package LiveReviewsEU9.week14.avengers;

public class OnSaleItem extends Item{

    private double discountPercentage;

    public OnSaleItem (String name, int quantity, int catalogNumber, double price, double discountPercentage){
        super(name, quantity,catalogNumber,(price-price*discountPercentage));

    }

    public double getDiscountPercentage(){
        return discountPercentage;
    }
    public void setDiscountPercentage(double discountPercentage){
        this.discountPercentage = discountPercentage;
    }


    // inherits from Item Class
    /**
     * private instance variable, used for discount percentage
     */


    /**
     * public constructor for OnSaleItem
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     * @param discount
     *
     * - Calls Super class constructor by passing name,quantity,catalogNumber,price
     * - it will assign the price after deducting(minus) discount from the price
     * - assigns discount
     */



    /**
     * getter for discount
     * @return
     */




    /**
     * setter for discount
     * @param discount
     */
    @Override
    public String toString() {
        return "OnSaleItem{" +
                "discount =" + discountPercentage + "%" +
                ", name='" + getName() + '\'' +
                ", price=" + getDiscountPercentage() +
                '}';
    }

    /**
     * overrides toString from Item:
     *
     * @returns Object description in this format:
     *      * "OnSaleItem{discount=20.0%, name=ItemName, price=100.45}"
     *
     */

}
