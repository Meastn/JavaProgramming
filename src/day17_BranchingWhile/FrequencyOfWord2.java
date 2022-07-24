package day17_BranchingWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str="Cat Dog Cat Dog Cow Dog cat Tiger cAT";

        int freq=0;

        for (int i = 0; i < str.length()-2; i++) { // i: maximum value of i can be only 7, you have to subtract -3 to include the
            // last 4 character String in the calculation
            String include= str.substring(i,i+3);
            //System.out.println("include = " + include);

            if ( include.equalsIgnoreCase("Cat")) {
                freq++;
            }
        }
        System.out.println("freq = " + freq);
    }
}
