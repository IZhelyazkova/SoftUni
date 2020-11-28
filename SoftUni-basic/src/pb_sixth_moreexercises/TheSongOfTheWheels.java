package pb_sixth_moreexercises;

import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int control = Integer.parseInt(scan.nextLine());
        int count = 0;
        String password = "";
        boolean found = false;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (i * j + k * l == control) {
                            if (i < j && k > l) {
                                count++;
                                System.out.printf("%d%d%d%d ", i, j, k, l);
                                if (count == 4) {
                                    password = Integer.toString(i) + Integer.toString(j) + Integer.toString(k) + Integer.toString(l);
                                    found = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (found) {
            System.out.printf("\nPassword: %s", password);
        } else {
            if (count < 4) {
                System.out.printf("\nNo!");
            } else {
                System.out.printf("No!");
            }
        }

    }
}
