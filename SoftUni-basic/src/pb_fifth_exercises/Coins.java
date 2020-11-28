package pb_fifth_exercises;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine())*100;

        int coins = 0;
//
//        coins = coins + add;
//        money = money - add * 2;

        if (money >= 200) {
            int add = ((int)money / 200);
            coins = coins + add;
            money = money - add * 200;
        }
        if (money >= 100) {
            coins ++;
            money = money - 100;
        }
        if (money >= 50) {
            coins++;
            money = money - 50;
        }
        if (money >= 20) {
            int add = ((int)money / 20);
            coins = coins + add;
            money = money - ((int) Math.floor(add)) * 20;
        }
        if (money >= 10) {
            coins++;
            money = money - 10;
        }
        if (money >= 5) {
            coins ++;
            money = money - 5;
        }
        if (money >= 2) {
            int add = ((int)money / 2);
            coins = coins + add;
            money = money - ((int) Math.floor(add)) * 2;
        }
        if (money >= 1) {
            coins ++;
            money = money - 1;
        }
        System.out.println(coins);

    }
}
