package day27_WrapperClasses;

public class WrapperClassIntro {
    public static void main(String[] args) {

        int num1 = 200; // We can not use primitive data types in data structures other than Arrays ie. Collections, Maps

        Integer n1= num1; // This is an AUTOBOXING converting int data type to a Wrapper INTEGER CLASS
        // Long n1 = num1; You can not convert a data type to a different Wrapper Class dedicated to that data type

        int num2 = n1; // UNBOXING converts an INTEGER WRAPPER CLASS back to int primitive data type
        // AN OBJECT IS AN INSTANCE OF A CLASS. primitives are not classes so other data structures does not support them.
        System.out.println("--------------------------------");

        Integer IntegerValue = 100;
        long longValue = IntegerValue; // we do not need explicit casting if the data type is in the range of the primitive data type

        Byte b1= 25; // You can convert any Wrapper Class to any primitive data type as long as it is in the range
        byte b11 = b1;
        short s1 = b1;
        int i1=b1;
        long l1=b1;
        System.out.println("--------------------------------");
        int num3= 200;  // CAN NOT CONVERT
        // Long l2 = num3; // A primitive data type can only be converted AUTO BOXED to its own distinctive Wrapper class
        // Double d2= num3;
        // Short s2= num3;
        System.out.println("--------------------------------");
        Integer z=900;
        Integer y=z; // This is not AUTO BOXING this is reassigning a WRAPPER CLASS TO A NEW ONE

        System.out.println("--------------------------------");
        int [] number1 = {1,2,3,4,5};
        Integer [] numbers2 = {1,2,3,4,5}; // ARRAY SUPPORTS BOTH PRIMITIVE DATA TYPES AND WRAPPER CLASSES

        // WRAPPER CLASSES PROVIDE USEFUL METHODS
        // Methods are created within Classes and since Wrapper Classes they also contain useful methods
        // MOST POPULAR WRAPPER METHODS
        // 1. parse methods, convert Strings to other primitive data types. ie. you can not calculate numbers within a string unless
        // you parse them to number data types such as int
        // ie. "123567" this is a String ** If the string includes chars other than numbers it can not be parsed to int
        //      123567 this is an integer
        //2. valueOf methods



    }

}
