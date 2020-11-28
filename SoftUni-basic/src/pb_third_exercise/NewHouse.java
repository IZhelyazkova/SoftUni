package pb_third_exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flower = scan.nextLine();
        int flowersCount = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        double discount = 0;
        double totalPrice = 0;

        switch (flower) {
            case "Roses":
                if (flowersCount > 80) {
                    discount = 0.1;
                }
                totalPrice = (flowersCount * 5.0);
                totalPrice = totalPrice - (totalPrice * discount);
                break;
            case "Dahlias":
                if (flowersCount > 90) {
                    discount = 0.15;
                }
                totalPrice = (flowersCount * 3.8);
                totalPrice = totalPrice - (totalPrice * discount);
                break;
            case "Tulips":
                if (flowersCount > 80) {
                    discount = 0.15;
                }
                totalPrice = (flowersCount * 2.8);
                totalPrice = totalPrice - (totalPrice * discount);
                break;
            case "Narcissus":
                if (flowersCount < 120) {
                    discount = 0.15;
                }
                totalPrice = (flowersCount * 3.0);
                totalPrice = totalPrice + (totalPrice * discount);
                break;
            case "Gladiolus":
                if (flowersCount < 80) {
                    discount = 0.20;
                }
                totalPrice = (flowersCount * 2.5);
                totalPrice = totalPrice + (totalPrice * discount);
                break;
        }

        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flower, (budget - totalPrice));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", (totalPrice - budget));
        }
    }
}
