package pb_second_exercise.godzillavs;

import java.util.Scanner;

public class Kong {
    public static void main(String[] args) {
        double budget = 0;
        int actors = 0;
        double clothPrice = 0;

        Scanner scan = new Scanner(System.in);
        budget = Double.parseDouble(scan.nextLine());
        actors = Integer.parseInt(scan.nextLine());
        clothPrice = Double.parseDouble(scan.nextLine());

        double decor = budget / 10;
        double clothPriceTotal = actors * clothPrice;
        if (actors > 150) {
            clothPriceTotal = clothPriceTotal - (clothPriceTotal * 0.1);
        }

        double moneyLeft = budget - decor - clothPriceTotal;
        if (moneyLeft < 0) {
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.", moneyLeft*-1);
        } else {
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.",moneyLeft);
        }

    }
}
