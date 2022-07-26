package day32_CustomClass_Constructors;

public class CarpetMarket {

    public static void main(String[] args) {

        Carpet carpet1= new Carpet(2,3,24.6,true);
        Carpet carpet2= new Carpet(3,4,36.4, true);
        Carpet carpet3= new Carpet(1,2,12.6,false);

        carpet1.calcCost();
        System.out.println(carpet1);

        carpet2.calcCost();
        System.out.println(carpet2);

        carpet3.calcCost();
        System.out.println(carpet3);
    }
}
