package second.moreExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String input = "";
        long left = 0;
        long right = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            input = scan.nextLine();
            left = Long.parseLong(input.split(" ")[0]);
            right = Long.parseLong(input.split(" ")[1]);

            if (left > right) {
                left = Math.abs(left);
                String leftStr = "" + left;
                for (int j = 0; j < leftStr.length(); j++) {
                    sum += Character.getNumericValue(leftStr.charAt(j));
                }
            } else {
                right = Math.abs(right);
                String rightStr = "" + right;
                for (int j = 0; j < rightStr.length(); j++) {
                    sum += Character.getNumericValue(rightStr.charAt(j));
                }
            }
            System.out.println(Math.abs(sum));
            sum = 0;
        }

    }
}
