package pb_fifth_exercises;

import java.util.Scanner;

public class Coins2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine()) * 100;

        int coins = 0;

        while (money > 0) {
            if (money >= 200) {
                coins++;
                money = (money - 200);
            } else if (money >= 100) {
                coins++;
                money = (money - 100);
            } else if (money >= 50) {
                coins++;
                money = money - 50;
            } else if (money >= 20) {
                coins++;
                money = money - 20;
            } else if (money >= 10) {
                coins++;
                money = money - 10;
            } else if (money >= 5) {
                coins++;
                money = money - 5;
            } else if (money >= 2) {
                coins++;
                money = money - 2;
            } else if (money >= 1) {
                coins++;
                money = 0;
                break;
            }
        }
        System.out.println(coins);
    }
}
