package pb_third_exercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fishermans = Integer.parseInt(scan.nextLine());
        int boatprice = 0;
        double discount = 0;
        double totalPrice = 0;
        double discountMore = 0;

        switch (season) {
            case "Spring":
                boatprice = 3000;
                break;
            case "Summer":
            case "Autumn":
                boatprice = 4200;
                break;
            case "Winter":
                boatprice = 2600;
                break;
        }
        if (fishermans <= 6) {
            discount = 0.1;
        } else if (fishermans <= 11) {
            discount = 0.15;
        } else {
            discount = 0.25;
        }
        totalPrice = boatprice - (boatprice * discount);
        if (fishermans % 2 == 0 && !season.equals("Autumn")) {
            discountMore = 0.05;
            totalPrice = totalPrice - (totalPrice * discountMore);
        }
        if (budget >= totalPrice) {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - totalPrice));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(totalPrice - budget));
        }
    }
}
