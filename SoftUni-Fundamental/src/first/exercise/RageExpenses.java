package first.exercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostGames = Integer.parseInt(scan.nextLine());
        double displayTrash = 0;
        if (Math.floor(lostGames / 6) >= 2) {
            displayTrash = (int) (Math.floor(Math.floor(lostGames / 6)) / 2);
        }
        double rageExpenses = Double.parseDouble(scan.nextLine()) * Math.floor(lostGames / 2) + Double.parseDouble(scan.nextLine()) * Math.floor(lostGames / 3) + Double.parseDouble(scan.nextLine()) * Math.floor(lostGames / 6) + Double.parseDouble(scan.nextLine()) * displayTrash;
        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}
