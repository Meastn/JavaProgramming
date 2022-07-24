package Replit;

public class TreeGrowth {
    public static void main(String[] args) {
        int growth = 0;
        int totalYears = 0;
        int years = 0;

        // if (totalYears<=10) {
            for (int j = 1; j <= 3; j++) {
                growth += 1;
                totalYears ++;
                System.out.println("year " + totalYears + " - growth " +  growth + " cm");
            }

            for(int i=totalYears; i<10;i++) {
                growth +=2;
                totalYears ++;
                System.out.println("year " + totalYears + " - growth " +  growth + " cm");
            }



    }
}
