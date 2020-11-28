package pb_forth_lab;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double price = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());

        int money = 0;
        int toysMoney = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money = (money + i * 5) - 1;
            } else {
                toysMoney = toysMoney + toyPrice;
            }
        }
        int totalMoney = money + toysMoney;
        if (totalMoney >= price) {
            System.out.printf("Yes! %.2f", Math.abs(totalMoney - price));
        } else {
            System.out.printf("No! %.2f", Math.abs(totalMoney - price));
        }
    }
}
