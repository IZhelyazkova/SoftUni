package second.exercice;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startingYelds = Integer.parseInt(scan.nextLine());
        boolean lessThan100 = false;
        if (startingYelds < 100) {
            lessThan100 = true;
        }
        int days = 0;
        int harvested = 0;

        while (startingYelds >= 100) {
            days++;
            harvested += startingYelds - 26;
            startingYelds -= 10;
        }
        harvested -= 26;
        if (lessThan100) {
            System.out.printf("0%n0");
        } else {
            System.out.printf("%d%n%d", days, harvested);
        }
    }
}
