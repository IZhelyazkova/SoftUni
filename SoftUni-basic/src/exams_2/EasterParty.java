package exams_2;

import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int guests = 0;
        double pricePerOne = 0;
        double budget = 0;

        guests = Integer.parseInt(scan.nextLine());
        pricePerOne = Double.parseDouble(scan.nextLine());
        budget = Double.parseDouble(scan.nextLine());

        double cakePrice = budget / 10;
        if (guests > 20) {
            pricePerOne = pricePerOne * 0.75;
        } else if (guests > 15){
            pricePerOne = pricePerOne*0.8;
        }else if (guests>=10){
            pricePerOne = pricePerOne*0.85;
        }

        double totalPrice = guests*pricePerOne+cakePrice;

        if (totalPrice<=budget){
            System.out.printf("It is party time! %.2f leva left.", budget-totalPrice);
        }else {
            System.out.printf("No party! %.2f leva needed.",totalPrice-budget);
        }

    }
}
