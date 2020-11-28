package pb_forth_lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sumOdd = 0;
        int sumEven = 0;
        int number = 0;
        for (int i = 1; i <= n; i++) {
            number = Integer.parseInt(scan.nextLine());
            if (i % 2 == 0) {
                sumEven = sumEven + number;
            } else {
                sumOdd = sumOdd + number;
            }
        }
        if (sumEven == sumOdd) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumEven);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", (Math.abs(sumEven - sumOdd)));
        }
    }
}
