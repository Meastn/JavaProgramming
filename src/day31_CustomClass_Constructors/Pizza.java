package day31_CustomClass_Constructors;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping, numberofPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberofPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberofPepperoniTopping = numberofPepperoniTopping;
    }


    public double calcCost(){

        double startingPrice = (size=='S') ? 10 : (size=='M')?12:14;
        double totalPrice = startingPrice + (numberOfCheeseTopping+numberofPepperoniTopping)*2;

        return totalPrice;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberofPepperoniTopping=" + numberofPepperoniTopping +
                ", total price= $" + calcCost() +
                '}';
    }
}
