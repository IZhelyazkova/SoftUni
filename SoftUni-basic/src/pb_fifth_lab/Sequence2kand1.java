package pb_fifth_lab;

import java.util.Scanner;

public class Sequence2kand1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int num = 1;
        while (num <= n) {
            System.out.printf("%d\n", num);
            num = num * 2 + 1;
        }

    }
}
