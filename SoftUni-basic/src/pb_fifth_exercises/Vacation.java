package pb_fifth_exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scan.nextLine());
        double moneySheHave = Double.parseDouble(scan.nextLine());

        boolean repeat = true;
        int daysTotal = 0;
        int daysSpendInRow = 0;

        while (repeat) {
            String input = scan.nextLine();
            double sum = Double.parseDouble(scan.nextLine());
            daysTotal++;
            if (input.equals("save")) {
                moneySheHave = moneySheHave + sum;
                if (moneySheHave >= neededMoney) {
                    System.out.printf("You saved the money for %d days.", daysTotal);
                    repeat = false;
                    break;
                }
                daysSpendInRow = 0;
            } else {
                moneySheHave = moneySheHave - sum;
                if (moneySheHave < 0) {
                    moneySheHave = 0;
                }
                daysSpendInRow++;
                if (daysSpendInRow >= 5) {
                    System.out.printf("You can't save the money.\n%d", daysTotal);
                    repeat = false;
                    break;
                }
            }
        }

    }
}
