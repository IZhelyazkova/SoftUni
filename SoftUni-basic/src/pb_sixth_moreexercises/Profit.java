package pb_sixth_moreexercises;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int one = Integer.parseInt(scan.nextLine());
        int two = Integer.parseInt(scan.nextLine());
        int five = Integer.parseInt(scan.nextLine());
        int total = Integer.parseInt(scan.nextLine());


        for (int i = 0; i <= one; i++) {
            for (int j = 0; j <= two; j++) {
                for (int k = 0; k <= five; k++) {
                    if (i * 1 + j * 2 + k * 5 == total) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n", i, j, k, total);
                    }
                }
            }
        }

    }
}
