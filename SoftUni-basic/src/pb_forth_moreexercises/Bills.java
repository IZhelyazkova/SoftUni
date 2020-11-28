package pb_forth_moreexercises;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int months = Integer.parseInt(scan.nextLine());
        double electricityTotal = 0;
        double water = months * 20.0;
        double net = months * 15.0;
        double other = 0;

        for (int i = 0; i < months; i++) {
            double electricity = Double.parseDouble(scan.nextLine());
            electricityTotal = electricityTotal + electricity;
            other = other + ((20.0 + 15.0 + electricity) * 1.2);
        }

        System.out.printf("Electricity: %.2f lv\n", electricityTotal);
        System.out.printf("Water: %.2f lv\n", water);
        System.out.printf("Internet: %.2f lv\n", net);
        System.out.printf("Other: %.2f lv\n", other);
        System.out.printf("Average: %.2f lv", (electricityTotal + water + net + other) / (double) months);

    }
}
