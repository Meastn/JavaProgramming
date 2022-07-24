package day21_ArraysUtilityForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {
        String[] names = {"Ali Veli", "Kırkdokuz Elli", "Yemiş Yememiş", "İçmiş Giymemiş", "Bakmış Kalakalmış", "Vur Patlasın"};

        for (String each : names) {
            String reversed = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i);
            }
            System.out.print(reversed + ", ");
        }
        
    }
}
