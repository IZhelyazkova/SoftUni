package pb_sixth_moreexercises;

import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int begginign1 = Integer.parseInt(scan.nextLine());
        int begining2 = Integer.parseInt(scan.nextLine());
        int toEnd1 = Integer.parseInt(scan.nextLine());
        int toEnd2 = Integer.parseInt(scan.nextLine());

        int end1 = begginign1 + toEnd1;
        int end2 = begining2 + toEnd2;

        for (int i = begginign1; i <= end1; i++) {
            for (int j = begining2; j <= end2; j++) {
                if (isPrime(i) && isPrime(j)) {
                    System.out.printf("%d%d\n", i, j);
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
