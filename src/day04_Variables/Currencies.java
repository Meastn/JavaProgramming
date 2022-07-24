package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

            int dollar = 1_000;

            double lira = dollar * 15.12;
            double euro = dollar * 0.9469;
            double pound= dollar * 0.8001;

            System.out.println(dollar + " $ equals to");
            System.out.println(pound + " pounds");
            System.out.println(euro + " euro");
            System.out.println( lira + " liras");
    }
}
