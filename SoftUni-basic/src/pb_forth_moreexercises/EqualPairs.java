package pb_forth_moreexercises;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int sum = num1 + num2;
        boolean its = true;
        int max = 0;
        int difference = 0;

        for (int i = 0; i < n - 1; i++) {
            num1 = Integer.parseInt(scan.nextLine());
            num2 = Integer.parseInt(scan.nextLine());
            int sum2 = num1 + num2;
            if (sum2 != sum) {
                its = false;
            }
            difference = Math.abs(sum - sum2);
            if (difference > max) {
                max = difference;
            }
            sum = sum2;
//            if (sum2 < min) {
//                min = sum2;
//            }
//            if (sum2 > max ) {
//                max = sum2;
//            }
        }
        if (its == false) {
            System.out.printf("No, maxdiff=%d", max );
        } else {
            System.out.printf("Yes, value=%d", sum);
        }
    }
}
