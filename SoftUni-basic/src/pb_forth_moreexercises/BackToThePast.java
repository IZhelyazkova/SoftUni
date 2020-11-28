package pb_forth_moreexercises;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double inharitance = Double.parseDouble(scan.nextLine());
        int year = Integer.parseInt(scan.nextLine());
        int age = 17;
        double money = 0;

        for (int i = 1800; i <= year; i++) {
            age = age + 1;
            if (i % 2 == 0) {
                money = money + 12000;
            } else {
                money = money + (12000 + 50 * age);
            }

        }
        if (money <= inharitance) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", (inharitance - money));
        } else {
            System.out.printf("He will need %.2f dollars to survive.", (money - inharitance));
        }
    }
}
