package pb_forth_lab;

import java.util.Scanner;

public class LeftAndRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine()) * 2;
        int sum1 = 0;
        int sum2 = 0;
        int number = 0;

        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(scan.nextLine());
            if (i < n / 2) {
                sum1 = sum1 + number;
            } else {
                sum2 = sum2 + number;
            }
        }
        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d", sum1);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sum1 - sum2));
        }
    }
}
