package Utilities;

import java.util.Arrays;

public class ArraysUtility {
    // (A) PRINT EACH ELEMENT IN AN ARRAY IN SEPERATE LINES
    // (1) prints each integer element of an integer array as separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    // (2) prints each decimal element of an double array as separate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    // (3) prints each char element of a char array as separate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

    // (4) prints each String element of a String array as separate lines
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }

    // (B) RETURN THE MAXIMUM NUMBER IN AN ARRAY
    // (5) returns the maximum number of an integer array
    public static int maxNumber(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    // (6) returns the maximum number of a double array
    public static double maxNumber(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    // (7) returns the maximum number of a long array
    public static long maxNumber(long[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    // (C) CHECK IF AN ELEMENT IS ALREADY CONTAINED IN AN ARRAY
    // (8) checks if the given integer is contained in the given array, returns boolean, contains (int [], int)
    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) { // if an element is contained in the given array it checks
                result = true;
            }
        }
        return result;

    }

    // (9) checks if the given decimal is contained in the given array, returns boolean, contains (double [], double)
    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;

    }

    // (10) checks if the given char is contained in the given array, returns boolean, contains (char [], char)
    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;

    }

    // (11) checks if the given String is contained in the given array, returns boolean, contains (String [], String)
    public static boolean contains(String[] array, String element) {
        boolean result = false;
        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }
        return result;

    }

    // (D) MERGES TWO SEPARATE ARRAYS INTO ONE
    // (12) merges two int Arrays into a combined Array
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] combined = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            combined[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            combined[i + arr1.length] = arr2[i];
        }
        return combined;
    }

    // (13) merges two double Arrays into a combined Array
    public static double[] mergeArrays(double[] arr1, double[] arr2) {
        double[] combined = new double[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            combined[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            combined[i + arr1.length] = arr2[i];
        }
        return combined;
    }

    // (14) merges two  char Arrays into a combined Array
    public static char[] mergeArrays(char[] arr1, char[] arr2) {
        char[] combined = new char[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            combined[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            combined[i + arr1.length] = arr2[i];
        }
        return combined;
    }

    // (15) merges two String Arrays into a combined Array
    public static String[] mergeArrays(String[] arr1, String[] arr2) {
        String[] combined = new String[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            combined[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            combined[i + arr1.length] = arr2[i];
        }
        return combined;
    }

    // (E) ADDS NEW ELEMENTS TO THE ARRAY
    // (16) Adds elements to an int array
    public static int[] addElements(int[] arr1, int element) {
        int[] result = new int[arr1.length + 1];
        int i = 0;
        for (int each : arr1) {
            result[i++] = each; // copies arr1 elements one by one into the new result array
        }

        result[i] = element; // adds the new element to the end of the result array

        return result;

    }

    // (17) Adds elements to an double array
    public static double[] addElements(double[] arr1, double element) {
        double[] result = new double[arr1.length + 1];
        int i = 0;
        for (double each : arr1) {
            result[i++] = each; // copies arr1 elements one by one into the new result array
        }

        result[i] = element; // adds the new element to the end of the result array

        return result;

    }

    // (18) Adds elements to a String array
    public static String[] addElements(String[] arr1, String element) {
        String[] result = new String[arr1.length + 1];
        int i = 0;
        for (String each : arr1) {
            result[i++] = each; // copies arr1 elements one by one into the new result array
        }

        result[i] = element; // adds the new element to the end of the result array

        return result;

    }

    // (19) Adds elements to a String array
    public static char[] addElements(char[] arr1, char element) {
        char[] result = new char[arr1.length + 1];
        int i = 0;
        for (char each : arr1) {
            result[i++] = each; // copies arr1 elements one by one into the new result array
        }

        result[i] = element; // adds the new element to the end of the result array

        return result;

    }

    // (F) REMOVE AN ELEMENTS FROM AN  ARRAY AT A GIVEN INDEX NUMBER
    // (20) Remove an element from an  int array at a given index number
    public static int[] removeElements(int[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index : " + index);
            System.exit(0);
        }
        int[] result = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) { // if the index of array is matching the given index
                continue; // skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    // (21) Remove an element from an  double array at a given index number
    public static double[] removeElements(double[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index : " + index);
            System.exit(0);
        }
        double[] result = new double[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) { // if the index of array is matching the given index
                continue; // skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    // (22) Remove an element from an  String array at a given index number
    public static String[] removeElements(String[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index : " + index);
            System.exit(0);
        }
        String[] result = new String[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) { // if the index of array is matching the given index
                continue; // skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    // (23) Remove an element from a  char array at a given index number
    public static char[] removeElements(char[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index : " + index);
            System.exit(0);
        }
        char[] result = new char[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) { // if the index of array is matching the given index
                continue; // skip
            }
            result[j++] = array[i];
        }
        return result;
    }

    // (G) REVERSE AN ARRAY
    // (24) reverse an int array
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }
        return reversed;

    }

    // (25) reverse a double array
    public static double[] reverseArray(double[] array) {
        double[] reversed = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }
        return reversed;

    }

    // (26) reverse a char array
    public static char[] reverseArray(char[] array) {
        char[] reversed = new char[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }
        return reversed;
    }

    // (27) reverse a String array
    public static String[] reverseArray(String[] array) {
        String[] reversed = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = array[i];
        }
        return reversed;

    }

    // (H) COUNT THE FREQUENCY OF A SPECIFIC ELEMENT IN AN ARRAY
    // (28) Count the frequency of a given element in an INT array
    public static int freqOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;

    }

    // (29) Count the frequency of a given element in a DOUBLE array
    public static int freqOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;

    }

    // (30) Count the frequency of a given element in a CHAR array
    public static int freqOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;

    }

    // (31) Count the frequency of a given element in a STRING array
    public static int freqOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;

    }

    // (I) CHECKS IF AN ELEMENT IN AN ARRAY IS UNIQUE
    // (32) Checks if an element is unique in an INT array
    public static boolean uniqueElement(int[] array, int element) {
        boolean check = false;
        int count = 0;
        for (int i : array) {
            if (i == element) {
                count++;

            }
            if (count == 1) {
                check = true;
            } else {
                check = false;
            }

        }
        return check;

    }

    // (33) Checks if an element is unique in an INT array
    public static boolean uniqueElement(double[] array, double element) {
        boolean check = false;
        int count = 0;
        for (double i : array) {
            if (i == element) {
                count++;

            }
            if (count == 1) {
                check = true;
            } else {
                check = false;
            }

        }
        return check;

    }

    // (35) Checks if an element is unique in an CHAR array
    public static boolean uniqueElement(char[] array, char element) {
        boolean check = false;
        int count = 0;
        for (char i : array) {
            if (i == element) {
                count++;

            }
            if (count == 1) {
                check = true;
            } else {
                check = false;
            }

        }
        return check;

    }

    // (36) Checks if an element is unique in an STRING array
    public static boolean uniqueElement(String[] array, String element) {
        boolean check = false;
        int count = 0;
        for (String i : array) {
            if (i == element) {
                count++;

            }
            if (count == 1) {
                check = true;
            } else {
                check = false;
            }

        }
        return check;

    }

    // (J) REMOVES ALL DUPLICATE ELEMENTS WITHIN AN ARRAY
    // (37) Remove duplicate elements from an INT array
    public static int[] removeDuplicates(int[] array) {
        int[] result = {};
        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElements(result, each);
            }
        }
        return result;
        /* HAYRETTİN ÇÖZÜMÜ
        int [] result = new int [array.length];

        boolean found = false;
        int duplicate =0;
        int k=0;

        for (int i=0; i<array.length; i++) {
            found = false;
            for (int j=i+1; j<array.length && !found; j++) {
                if (array [j] == array[i]) {
                    found = true;
                    duplicate ++;
                }
            }
            if (!found) {
                result[k++] = array [i];
            }

        }
        int [] newArray = new int [array.length-duplicate];
        for (int i=0; i<newArray.length; i++) {
            newArray [i] = result [i];
        }
        return newArray;
*/
    }

    // (38) Remove duplicate elements from an DOUBLE array
    public static double[] removeDuplicates(double[] array) {

        double[] result = {};
        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElements(result, each);
            }
        }
        return result;

    }

    // (39) Remove duplicate elements from an CHAR array
    public static char[] removeDuplicates(char[] array) {
        char[] result = {};
        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElements(result, each);
            }
        }
        return result;

    }

    // (38) Remove duplicate elements from an DOUBLE array
    public static String[] removeDuplicates(String[] array) {
        String[] result = {};
        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElements(result, each);
            }
        }
        return result;

    }

    // (39) replace an element in an INT array with a given element
    // (K) REPLACE AN ELEMENT AT GIVEN INDEX WITH A GIVEN VALUE
    public static int[] replace(int[] array, int index, int newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index number:" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }

    // (40) replace an element in a double array with a given element
    public static double[] replace(double[] array, int index, double newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index number:" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }

    // (41) replace an element in a String array with a given element
    public static String[] replace(String[] array, int index, String newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index number:" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }

    // (42) replace an element in a CHAR  array with a given element
    public static char[] replace(char[] array, int index, char newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index number:" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }

    // (L) REPLACE ALL COPIES OF A REPEATING ELEMENT IN ARRAY WITH THE GIVEN VALUE
    // (43) Replace all copies of an element with a new value in an INT array
    public static int[] replaceAll(int[] array, int oldValue, int newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;

    }

    // (44) Replace all copies of an element with a new value in a DOUBLE array
    public static double[] replaceAll(double[] array, double oldValue, double newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;

    }

    // (45) Replace all copies of an element with a new value in a STRING array
    public static String[] replaceAll(String[] array, String oldValue, String newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)) {
                array[i] = newValue;
            }
        }
        return array;

    }

    // (46) Replace all copies of an element with a new value in a CHAR array
    public static char[] replaceAll(char[] array, char oldValue, char newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;

    }

    // (M) INSERT AN ELEMENT INTO AN ARRAY
    // (47) Insert an element into an INT ARRAY
    public static int[] insertElement(int[] array, int index, int element) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index : " + index);
            System.exit(0);
        }

        int[] firstPart = new int[index];
        int[] secondPart = new int[array.length - index];
        int[] result = new int[firstPart.length + secondPart.length + 1];


        for (int i = 0; i < firstPart.length; i++) {
            firstPart[i] = array[i];
        }
        int[] midPart = new int[firstPart.length + 1];

        midPart = ArraysUtility.addElements(firstPart, element);

        for (int i = 0; i < secondPart.length; i++) {
            secondPart[i] = array[i + index];
        }
        result = ArraysUtility.mergeArrays(midPart, secondPart);
        return result;
    }

    // (48) Insert an element into a DOUBLE ARRAY
    public static double[] insertElement(double[] array, int index, double element) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index : " + index);
            System.exit(0);
        }

        double[] firstPart = new double[index];
        double[] secondPart = new double[array.length - index];
        double[] result = new double[firstPart.length + secondPart.length + 1];


        for (int i = 0; i < firstPart.length; i++) {
            firstPart[i] = array[i];
        }
        double[] midPart = new double[firstPart.length + 1];

        midPart = ArraysUtility.addElements(firstPart, element);

        for (int i = 0; i < secondPart.length; i++) {
            secondPart[i] = array[i + index];
        }
        result = ArraysUtility.mergeArrays(midPart, secondPart);
        return result;
    }

    // (49) Insert an element into a STRING ARRAY
    public static String[] insertElement(String[] array, int index, String element) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index : " + index);
            System.exit(0);
        }

        String[] firstPart = new String[index];
        String[] secondPart = new String[array.length - index];
        String[] result = new String[firstPart.length + secondPart.length + 1];


        for (int i = 0; i < firstPart.length; i++) {
            firstPart[i] = array[i];
        }
        String[] midPart = new String[firstPart.length + 1];

        midPart = ArraysUtility.addElements(firstPart, element);

        for (int i = 0; i < secondPart.length; i++) {
            secondPart[i] = array[i + index];
        }
        result = ArraysUtility.mergeArrays(midPart, secondPart);
        return result;
    }

    // (50) Insert an element into a CHAR ARRAY
    public static char[] insertElement(char[] array, int index, char element) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index : " + index);
            System.exit(0);
        }

        char[] firstPart = new char[index];
        char[] secondPart = new char[array.length - index];
        char[] result = new char[firstPart.length + secondPart.length + 1];


        for (int i = 0; i < firstPart.length; i++) {
            firstPart[i] = array[i];
        }
        char[] midPart = new char[firstPart.length + 1];

        midPart = ArraysUtility.addElements(firstPart, element);

        for (int i = 0; i < secondPart.length; i++) {
            secondPart[i] = array[i + index];
        }
        result = ArraysUtility.mergeArrays(midPart, secondPart);
        return result;
    }

    //  (N) SWAP PLACES OF TWO ELEMENTS IN AN ARRAY
    // (51) Swap two elements' places in an INT ARRAY
    public static int[] swapElements(int[] array, int firstIndex, int secondIndex) {

        int [] result = new int [array.length+1];

        result[result.length-1] = array [firstIndex];

        array[firstIndex] = array[secondIndex];
        array[secondIndex] = result[result.length-1];
        return array;

    }
    // (52) Swap two elements' places in a DOUBLE ARRAY
    public static double[] swapElements(double[] array, int firstIndex, int secondIndex) {

        double [] result = new double [array.length+1];

        result[result.length-1] = array [firstIndex];

        array[firstIndex] = array[secondIndex];
        array[secondIndex] = result[result.length-1];
        return array;

    }
    // (53) Swap two elements' places in a CHAR ARRAY
    public static char[] swapElements(char[] array, int firstIndex, int secondIndex) {
        char [] result = new char [array.length+1];

        result[result.length-1] = array [firstIndex];

        array[firstIndex] = array[secondIndex];
        array[secondIndex] = result[result.length-1];
        return array;

    }
    // (54) Swap two elements' places in a STRING ARRAY
    public static String [] swapElements(String [] array, int firstIndex, int secondIndex) {
        String [] result = new String [array.length+1];

        result[result.length-1] = array [firstIndex];

        array[firstIndex] = array[secondIndex];
        array[secondIndex] = result[result.length-1];
        return array;

    }
}


// merger COMPLETED
// addElements COMPLETED
// removeElements COMPLETED
// reverse COMPELETED
// frequencyOfSpecificElement COMPELETED
// uniqueElement COMPELETED
// removeDuplicates  COMPELETED


// INSERT METHOD WILL BE ADDED
// int array, index of insertion, element to insert
// {2,3,4,5} ,          2               , 40
// {2,3,40,4,5}

/* SWAP METHODS WILL BE ADDED total 56 methods

Swap Task:
2.1 Create a method named swap that passes three parameters: integer
array, integer i, integer j. the method swaps the element at index i with
the element at index j, and returns the new array
Ex:
arr = {10, 20, 30, 40, 50};
swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}
 */