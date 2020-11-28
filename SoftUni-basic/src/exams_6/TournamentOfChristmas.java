package exams_6;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        String input = "";
        int winCount = 0;
        int loseCount = 0;
        double moneyPerDay = 0;
        double totalMoney = 0;
        int wins = 0;
        for (int i = 1; i <= days; i++) {
            while (!input.equals("Finish")) {
                input = scan.nextLine();
                if (input.equals("Finish")) {
                    break;
                } else {
                    String wORl = scan.nextLine();
                    if (wORl.equals("win")) {
                        moneyPerDay = moneyPerDay + 20;
                    }
                }
            }
            if (winCount > loseCount) {
                wins++;
                totalMoney = totalMoney + moneyPerDay * 1.1;
            } else {
                totalMoney = totalMoney + moneyPerDay;
            }
            moneyPerDay = 0;
            winCount = 0;
            loseCount = 0;
        }
    }
}
