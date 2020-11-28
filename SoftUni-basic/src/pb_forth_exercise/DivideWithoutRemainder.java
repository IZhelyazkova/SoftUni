package pb_forth_exercise;

import java.util.Scanner;

public class
DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int divideBy2 = 0;
        int divideBy3 = 0;
        int divideBy4 = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number % 2 == 0) {
                divideBy2++;
                if (number % 4 == 0) {
                    divideBy4++;
                }
            }
            if (number % 3 == 0) {
                divideBy3++;
            }
        }
        double p1 = (double) divideBy2 / n * 100.00;
        double p2 = (double) divideBy3 / n * 100.00;
        double p3 = (double) divideBy4 / n * 100.00;
        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%", p1, p2, p3);
    }
}
