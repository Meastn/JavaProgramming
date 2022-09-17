package day44_Abstraction_Interface.Zoo;

public interface Playable{

    boolean isFriendly=true; // static by default no need to write the keyword
                            // initialize right away  since it is also final by default
/*
    static void method(){ // you can use a dummy static method to check if th variable is also static
        System.out.println(isFriendly);
    }

 */
    void play(); // abstract by default no need to write the keyword
}
