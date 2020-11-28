package pb_forth_exercise;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            sum += num;
            if (num > max) {
                max = num;
            }

        }
        if (sum - max == max) {
            System.out.printf("Yes\nSum = %d", sum - max);
        } else {
            System.out.printf("No\nDiff = %d", Math.abs(sum-max-max));
        }
    }
}
