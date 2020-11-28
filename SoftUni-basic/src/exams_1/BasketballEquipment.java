package exams_1;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        int priceForYear = 0;

        Scanner scan = new Scanner(System.in);
        priceForYear = Integer.parseInt(scan.nextLine());

        double sneekers = priceForYear*1.0 - (priceForYear*1.0*40/100);
        double cloths = sneekers - (sneekers*20/100);
        double ball = cloths/4;
        double acsesoaries = ball/5;

        double total = priceForYear+sneekers+cloths+ball+acsesoaries;

        System.out.printf("%.2f",total);
    }
}
