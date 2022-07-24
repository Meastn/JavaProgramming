package day26_CustomMethodsPractice;

public class RemoveElements1 {

    public static int [] removeElements1 (int [] array, int index) {

        int [] result = new int [array.length-1];
        int j=0;
        for (int i=0; i<array.length;  i++) {
            if (i == index){ // if the element of the array matches the index number it skips adding this element
                continue;
            }
            result [j++] = array [i];
        }

        return result;
    }
}
