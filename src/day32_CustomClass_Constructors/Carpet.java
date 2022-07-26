package day32_CustomClass_Constructors;

public class Carpet {

    public int width, length;
    public double unitPrice;
    public boolean isPersian;

    public Carpet(int width, int length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost() {
        double totalPrice = (width*length)*unitPrice;
        if (isPersian) {
            totalPrice += 200;
        } else {
            totalPrice = totalPrice;
        }
        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $ " + unitPrice +
                ", isPersian=" + isPersian +
                ", final price = $ " + calcCost() +
                '}';
    }
}
