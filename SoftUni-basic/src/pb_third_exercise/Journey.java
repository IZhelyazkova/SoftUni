package pb_third_exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        double spendMoney = 0;
        String where = "";
        String campOr = "";
        switch (season) {
            case "summer":
                if (budget <= 100) {
                    where = "Bulgaria";
                    spendMoney = budget * 0.3;
                } else if (budget <= 1000) {
                    where = "Balkans";
                    spendMoney = budget * 0.4;
                } else {
                    where = "Europe";
                    spendMoney = budget * 0.9;
                }
                campOr = "Camp";
                break;

            case "winter":
                if (budget <= 100) {
                    where = "Bulgaria";
                    spendMoney = budget * 0.7;
                } else if (budget <= 1000) {
                    where = "Balkans";
                    spendMoney = budget * 0.8;
                } else {
                    where = "Europe";
                    spendMoney = budget * 0.9;
                }
                campOr = "Hotel";
                break;
        }
        if (where.equals("Europe")){
            campOr = "Hotel";
        }
        System.out.printf("Somewhere in %s\n", where);
        System.out.printf("%s - %.2f", campOr, spendMoney);
    }
}
