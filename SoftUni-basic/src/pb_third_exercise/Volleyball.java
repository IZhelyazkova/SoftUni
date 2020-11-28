package pb_third_exercise;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String year = scan.nextLine();
        int offDays = Integer.parseInt(scan.nextLine());
        int weekendsHome = Integer.parseInt(scan.nextLine());
        int weeksInSofia = 48 - weekendsHome;
        double gamesInSofia = weeksInSofia * 3.0 / 4.0;
        double holidayGames = offDays * 2.0 / 3.0;
        double totalGames = weekendsHome + gamesInSofia + holidayGames;
        if (year.equals("leap")) {
            totalGames = totalGames + (totalGames * 0.15);
        }
        System.out.printf("%.0f", Math.floor(totalGames));
    }
}
