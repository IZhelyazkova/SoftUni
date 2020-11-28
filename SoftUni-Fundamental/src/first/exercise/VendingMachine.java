package first.exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = "";
        double totalMoney = 0;
        double productPrice = 0;
        boolean valid = true;

        while (!input.equals("Start")) {
            input = scan.nextLine();
            if (input.equals("Start")) {
                break;
            } else {
                double addMoney = Double.parseDouble(input);
                if (addMoney == 0.1 || addMoney == 0.2 || addMoney == 0.5 || addMoney == 1.00 || addMoney == 2.00) {
                    totalMoney += addMoney;
                } else {
                    System.out.printf("Cannot accept %.2f%n", addMoney);
                }
            }
        }
        while (!input.equals("End")) {
            input = scan.nextLine();
            if (input.equals("End")) {
                System.out.printf("Change: %.2f", totalMoney);
                break;
            } else {
                switch (input) {
                    case "Nuts": //2.0
                        productPrice = 2.0;
                        break;
                    case "Water": // 0.7
                        productPrice = 0.7;
                        break;
                    case "Crisps":// 1.5
                        productPrice = 1.5;
                        break;
                    case "Soda": //0.8
                        productPrice = 0.8;
                        break;
                    case "Coke"://1.0
                        productPrice = 1.0;
                        break;
                    default:
                        System.out.println("Invalid product");
                        valid = false;
                        break;
                }
                if (totalMoney >= productPrice && valid) {
                    System.out.printf("Purchased %s%n", input);
                    totalMoney -= productPrice;
                } else if (totalMoney < productPrice && valid) {
                    System.out.println("Sorry, not enough money");
                }
            }
        }


    }
}
