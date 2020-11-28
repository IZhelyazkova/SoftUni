package pb_forth_exercise;

import java.util.Scanner;

public class OddOrEvenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double sumEven = 0;
        double sumOdd = 0;
        double maxEven = (double) Integer.MIN_VALUE;
        double maxOdd = (double) Integer.MIN_VALUE;
        double minEven = Double.MAX_VALUE;
        double minOdd = Double.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scan.nextLine());
            if (i % 2 == 0) {
                sumEven = sumEven + number;
                if (number > maxEven) {
                    maxEven = number;
                }
                if (number < minEven) {
                    minEven = number;
                }
            } else {
                sumOdd = sumOdd + number;
                if (number > maxOdd) {
                    maxOdd = number;
                }
                if (number < minOdd) {
                    minOdd = number;
                }
            }
        }
        if (sumOdd != 0) {
            System.out.printf("OddSum=%.2f,\nOddMin=%.2f,\nOddMax=%.2f,\n", sumOdd, minOdd, maxOdd);
        } else {
            System.out.printf("OddSum=%.2f,\nOddMin=No,\nOddMax=No,\n", sumOdd);
        }
        if (sumEven != 0) {
            System.out.printf("EvenSum=%.2f,\nEvenMin=%.2f,\nEvenMax=%.2f", sumEven, minEven, maxEven);
        } else {
            System.out.printf("EvenSum=%.2f,\nEvenMin=No,\nEvenMax=No", sumEven);
        }
    }
}
