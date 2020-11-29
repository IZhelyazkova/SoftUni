package first.exercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyHave = Double.parseDouble(scan.nextLine());
        double spend = 0;
        boolean notFound = false;
        boolean game = false;
        String input = "";

        while (!input.equals("Game Time")) {
            notFound = false;
            input = scan.nextLine();
            if (input.equals("Game Time")) {
                game = true;
                break;
            } else {
                double gamePrice = 0;
                switch (input) {
                    case "OutFall 4":
                    case "RoverWatch Origins Edition":
                        gamePrice = 39.99;
                        break;
                    case "CS: OG":
                        gamePrice = 15.99;
                        break;
                    case "Zplinter Zell":
                        gamePrice = 19.99;
                        break;
                    case "Honored 2":
                        gamePrice = 59.99;
                        break;
                    case "RoverWatch":
                        gamePrice = 29.99;
                        break;

                    default:
                        System.out.println("Not Found");
                        notFound = true;
                }
                if (!notFound) {
                    if (gamePrice <= moneyHave) {
                        System.out.printf("Bought %s%n", input);
                        moneyHave = moneyHave - gamePrice;
                        spend += gamePrice;
                    } else {
                        System.out.printf("Too Expensive%n");
                    }
                }
            }
            if (moneyHave == 0) {
                System.out.println("Out of mo-ney!");
                return;
            }
        }
        if (game) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f%n", spend, moneyHave);
        }
    }
}
