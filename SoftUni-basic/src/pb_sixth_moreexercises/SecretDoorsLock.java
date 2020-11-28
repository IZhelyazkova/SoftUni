package pb_sixth_moreexercises;

import java.util.Scanner;

public class SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int last = Integer.parseInt(scan.nextLine());

        for (int i = 2; i <= first; i+=2) {
            for (int j = 2; j <= second; j++) {
                for (int k = 2; k <= last; k+=2) {
                    if (isPrime(j)) {
                        System.out.printf("%d %d %d\n", i, j, k);
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
