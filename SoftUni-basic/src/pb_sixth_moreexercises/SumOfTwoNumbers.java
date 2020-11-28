package pb_sixth_moreexercises;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int begining = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());
        int counter = 0;
        boolean found = false;
        out:
        for (int i = begining; i <= end; i++) {
            for (int j = begining; j <= end; j++) {
                counter++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNumber);
                    found = true;
                    break out;
                }
            }
        }
        if (!found) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
