package Replit.Arrays;

import java.util.Scanner;

public class AverageTemperature {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        for (double each : temps) {
            total += each;
        }

        System.out.println(total / temps.length);
    }

}


/*
Given an array **temps** with temperature values find and print the average value


Example:

```
input: 80 88 88 84 82 78 60 68

output: 78.5
```

 */