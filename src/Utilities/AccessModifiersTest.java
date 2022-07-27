package Utilities;

import day34_Static_Garbage_Collection.AccessModifiers;

public class AccessModifiersTest {

    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        // System.out.println(AccessModifiers.defaultData); -- not visible, not accessible
        // System.out.println(AccessModifiers.privateData); -- not visible, not accessible
        AccessModifiers.method1();
        // AccessModifiers.method2(); -- not visible.not accessible
        //AccessModifiers.method3(); -- not visible.not accessible

    }
}
