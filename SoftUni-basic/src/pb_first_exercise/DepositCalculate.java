package pb_first_exercise;

import java.util.Scanner;

public class DepositCalculate {
    public static void main(String[] args) {
        double deposit = 0;
        int months = 0;
        double interest = 0;
        Scanner scan = new Scanner(System.in);
        deposit = Double.parseDouble(scan.nextLine());
        months = Integer.parseInt(scan.nextLine());
        interest = Double.parseDouble(scan.nextLine());
        double persent = deposit / 100 * interest;
        System.out.println(deposit + months * ((persent) / 12));
    }
}
