package second.lab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int total = 0;
        boolean itIsSpecial = false;
        for (int ch = 1; ch <= n; ch++) {
            int that = ch;
            while (ch > 0) {
                total += ch % 10;
                ch = ch / 10;
            }
            itIsSpecial = (total == 5) || (total == 7) || (total == 11);
            if (itIsSpecial) {
                System.out.printf("%d -> True%n", that);
            } else {
                System.out.printf("%d -> False%n", that);
            }
            total = 0;
            ch = that;
        }


    }
}
