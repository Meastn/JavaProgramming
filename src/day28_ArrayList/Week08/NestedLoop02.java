package day28_ArrayList.Week08;

public class NestedLoop02 {
    public static void main(String[] args) {

        int rowCount = 6;

        for (int i = 0; i < rowCount; i++) {

            for (int j = 0; j <= i; j++) {

                if (j % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
        }
        System.out.println();
        System.out.println("-----");

        //rowCount = 7;
        for (int z = 0; z <= 6; z++) {
            for (int y = 6; y <= z; y++) {
                if (y % 2 == 1) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
        }
        System.out.println();

    }
}


/*
write a java program to print the following pattern
1
10
101
1010
10101
101010
101010
10101
1010
101
10
1
 */