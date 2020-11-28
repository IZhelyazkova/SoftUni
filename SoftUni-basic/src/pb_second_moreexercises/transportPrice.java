package pb_second_moreexercises;

import java.util.Scanner;

public class transportPrice {
    public static void main(String[] args) {
        int km = 0;
        String partOfDay = "";

        double price = 0;

        Scanner scan = new Scanner(System.in);
        km = Integer.parseInt(scan.nextLine());
        partOfDay = scan.nextLine();

        if (partOfDay.equals("day")) {
            if (km >= 100) {
                price = km * 0.06;
            } else if (km >= 20) {
                price = km * 0.09;
            } else {
                price = km * 0.79 + 0.70;
            }
        } else {
            if (km >= 100) {
                price = km * 0.06;
            } else if (km >= 20) {
                price = km * 0.09;
            } else {
                price = km * 0.90 + 0.70;
            }
        }
        System.out.printf("%.2f", price);
    }
}
