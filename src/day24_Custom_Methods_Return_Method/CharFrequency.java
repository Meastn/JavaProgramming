package day24_Custom_Methods_Return_Method;

public class CharFrequency {

    public static void main(String[] args) {
        String str = "Cumh karşı açtıkları tazminat davasını kazandıklarını duyurdu.";
        str = str.toLowerCase();
        System.out.print("Unique characters in the text are : ");

        for (int i = 0; i < str.length(); i++) {

            int frequency = charFrequency(str, str.charAt(i));
            if (frequency == 1) {
                System.out.print(str.charAt(i) + ", ");
            }
        }


    }

    public static int charFrequency(String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }

}
