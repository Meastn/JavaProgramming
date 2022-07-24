package day17_BranchingWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AABBCCDDDAABACD";
        String result ="";

        for (int i = 0; i < str.length() ; i++) {
            String ch = ""+ str.charAt(i);

            if (result.contains(ch)) {
                continue;
            }

            result += ch;

        } System.out.print(result);
    }
}
