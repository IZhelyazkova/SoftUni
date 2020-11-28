package pb_sixth_exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());

        for (int i = n1; i <= n2; i++) {
            String number = String.valueOf(i);
            int sumOdd = 0;
            int sumEven = 0;
            for (int j = 1; j <= 6; j++) {
                if (j % 2 == 0) {
                    sumEven = sumEven + Character.getNumericValue(number.charAt(j-1));
                } else {
                    sumOdd = sumOdd + Character.getNumericValue(number.charAt(j-1));
                }
            }
            if (sumEven == sumOdd) {
                System.out.printf("%s ", number);
            }
        }

    }
}
