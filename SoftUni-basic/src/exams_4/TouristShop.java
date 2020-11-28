package exams_4;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());

        int count = 0;
        double spendMoney = 0;
        String input = "";
        boolean noMoney = false;
        while (!input.equals("Stop")) {
            input = scan.nextLine();
            if (input.equals("Stop")) {
                break;
            } else {
                double productPrice = Double.parseDouble(scan.nextLine());
                count++;
                if (count % 3 == 0) {
                    productPrice = productPrice / 2;
                }
                if (budget >= productPrice) {
                    spendMoney = spendMoney + productPrice;
                    budget = budget - productPrice;
                } else {
                    System.out.printf("You don't have enough money!\nYou need %.2f leva!", (productPrice - budget));
                    noMoney = true;
                    break;
                }
            }
        }
        if (!noMoney) {
            System.out.printf("You bought %d products for %.2f leva.", count, spendMoney);
        }
    }
}
