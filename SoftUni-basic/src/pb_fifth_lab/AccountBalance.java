package pb_fifth_lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = 0;
        String income = scan.nextLine();
        while (!income.equals("NoMoreMoney")) {
            double income2 = Double.parseDouble(income);
            if (income2 > 0) {
                money = money + income2;
                System.out.printf("Increase: %.2f\n", income2);
            } else {
                System.out.println("Invalid operation!");
                break;
            }
            income = scan.nextLine();
        }
        System.out.printf("Total: %.2f", money);
    }
}
