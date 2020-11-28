package pb_sixth_moreexercises;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstUpper = Integer.parseInt(scan.nextLine());
        int secondUpper = Integer.parseInt(scan.nextLine());
        int thirdUpper = Integer.parseInt(scan.nextLine());

        for (int i = 2; i <= firstUpper; i = +2) {
            for (int j = 1; j <= secondUpper; j++) {
                for (int k = 2; k <= thirdUpper; k = +2) {
                    if (j >= 2 && j <= 7) {
                        if (isPrime(j)) {
                            System.out.printf("%d %d %d\n", i, j, k);
                        }
                    }
                }
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
