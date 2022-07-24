package day20_Arrays;

public class CrossOperation_byMelih {
    public static void main(String[] args) {
        double [] array1 = {5,3,78,21,7};
        double [] array2= {12,23,11,31,4};
        double result =0;
        String resultB ="";
        String [] resultT= new String[5];

        for (int i = 0; i < array1.length; i++) {
            result = array1[i] * array2[i];
            resultB =""+ result++;
        }
        System.out.println("result = " + result);

    }
}
