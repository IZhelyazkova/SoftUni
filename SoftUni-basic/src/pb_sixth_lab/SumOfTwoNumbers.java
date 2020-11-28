package pb_sixth_lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int begining = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());
        int count = 0;
        boolean found = false;

        for (int i = begining; i <= end; i++) {
            for (int j = begining; j <= end; j++) {
                count++;
                if (i + j == magicNumber) {
                    found = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, magicNumber);
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }
    }
}
