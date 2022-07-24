package day14_Strings;

public class StringMethods1 {
    public static void main(String[] args) {
        String str = new String ("Treim Method:      ");
        System.out.println("str w whitespaces = " + str);
        str = str.trim(); // you always have to reassign the variable to itself
        //with the new method. otherwise it will always use the initial version
        System.out.println("str wo whitespaces =" + str); // trim method deletes any spaces
        // at the beginning and at the end of the string
        int chr = str.indexOf("e");
        int chr2 = str.indexOf("od");
        int chr4 = str.lastIndexOf("e");
        System.out.println("index of first e= " + chr);
        System.out.println("index of last e = " + chr4);
    }
}
