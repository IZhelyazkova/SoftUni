package pb_sixth_moreexercises;

import java.util.Scanner;

public class HappyCatParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());
        double total = 0;
        double perDay = 0;

        for (int i = 1; i <= days; i++) {
            for (int j = 1; j <= hours; j++) {
                double add = 1;

                if (i % 2 == 0 && j % 2 != 0) {
                    add = 2.5;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    add = 1.25;
                }
                perDay = perDay + add;
            }
            System.out.printf("Day: %d - %.2f leva\n", i, perDay);
            total = total + perDay;
            perDay = 0;
        }
        System.out.printf("Total: %.2f leva", total);
    }
}
