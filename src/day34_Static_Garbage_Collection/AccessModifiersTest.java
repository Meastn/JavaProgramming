package day34_Static_Garbage_Collection;

public class AccessModifiersTest {

    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
        // System.out.println(AccessModifiers.privateData); -- not visible, not visible even inside the PACKAGE

    AccessModifiers.method1();
    AccessModifiers.method2();
    //AccessModifiers.method3(); -- not visible.not accessible
    }
}
