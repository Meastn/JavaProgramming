package practice;

public class WoodenSpoon {

    public static void main(String[] args) {

        float maas = 1000.0f;
        float dilim1 = 0.25f;
        int a = -100;
        int b= 200;

        boolean aIsNegative = a>0;

        float netmaas = maas - (maas * dilim1);

        System.out.println(" Maaştan yapılacak kesinti: " + maas * dilim1);
        System.out.println("netmaas = " + netmaas);
        System.out.println("aIsNegative = " + aIsNegative);



    }
}
