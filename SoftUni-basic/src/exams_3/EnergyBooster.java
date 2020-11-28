package exams_3;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruit = scan.nextLine();
        String pack = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());

        double price = 0;
        switch (fruit) {
            case "Watermelon":
                if (pack.equals("small")) {
                    price = count * 2 * 56.00;
                } else {
                    price = count * 5 * 28.70;
                }
                break;
            case "Mango":
                if (pack.equals("small")) {
                    price = count * 2 * 36.66;
                } else {
                    price = count * 5 * 19.6;
                }
                break;
            case "Pineapple":
                if (pack.equals("small")) {
                    price = count * 2 * 42.10;
                } else {
                    price = count * 5 * 24.80;
                }
                break;
            case "Raspberry":
                if (pack.equals("small")) {
                    price = count * 2 * 20.00;
                } else {
                    price = count * 5 * 15.20;
                }
                break;
        }
        if (price >= 400 && price <= 1000) {
            price = price * 0.85;
        } else if (price > 1000) {
            price = price * 0.5;
        }
        System.out.printf("%.2f lv.", price);
    }
}
