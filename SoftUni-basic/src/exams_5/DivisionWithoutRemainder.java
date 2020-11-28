package exams_5;

import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int p2 = 0;
        int p3 = 0;
        int p4 = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number % 2 == 0) {
                p2++;
                if (number % 4 == 0) {
                    p4++;
                }
            }
            if (number % 3 == 0) {
                p3++;
            }
        }
        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%", (double) p2 / n * 100, (double) p3 / n * 100, (double) p4 / n * 100);
    }
}
