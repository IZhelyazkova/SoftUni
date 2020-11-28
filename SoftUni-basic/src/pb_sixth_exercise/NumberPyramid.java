package pb_sixth_exercise;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int count = 1;

        for (int i = 1; count <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (count > n) {
                    break;
                } else {
                    System.out.printf("%d ", count);
                    count++;
                }
            }
            System.out.println();
        }

    }
}
