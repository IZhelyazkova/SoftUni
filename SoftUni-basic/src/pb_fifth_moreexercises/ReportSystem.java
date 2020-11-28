package pb_fifth_moreexercises;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int moneyNeeded = Integer.parseInt(scan.nextLine());
        int moneyGathered = 0;
        int cash = 0;
        int countCash = 0;
        int card = 0;
        int countCard = 0;

        boolean keepGoing = true;
        int count = 0;

        while (keepGoing) {
            String input = scan.nextLine();
            count++;
            if (input.equals("End")) {
                System.out.println("Failed to collect required money for charity.");
                break;
            } else {
                int money = Integer.parseInt(input);
                if (count % 2 == 0) {
                    if (money >= 10) {
                        card = card + money;
                        countCard++;
                        moneyGathered = moneyGathered + money;
                        System.out.println("Product sold!");
                    } else {
                        System.out.println("Error in transaction!");
                    }
                } else {
                    if (money <= 100) {
                        cash = cash + money;
                        countCash++;
                        moneyGathered = moneyGathered + money;
                        System.out.println("Product sold!");
                    } else {
                        System.out.println("Error in transaction!");
                    }
                }
            }
            if (moneyGathered >= moneyNeeded) {
                System.out.printf("Average CS: %.2f\nAverage CC: %.2f", ((double) cash / (double) countCash), ((double) card / (double) countCard));
                break;
            }
        }

    }
}
