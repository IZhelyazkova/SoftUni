package first.lab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int from = Integer.parseInt(scan.nextLine());

        if (from > 10) {
            System.out.printf("%d X %d = %d\n", n, from, n * from);
        } else {
            for (int i = from; i <= 10; i++) {
                System.out.printf("%d X %d = %d\n", n, i, n * i);
            }
        }
    }
}
