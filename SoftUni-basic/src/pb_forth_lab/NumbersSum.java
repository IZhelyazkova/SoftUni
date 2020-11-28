package pb_forth_lab;

import java.util.Scanner;

public class NumbersSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int n = Integer.parseInt(scan.nextLine());
        int number = 0;

        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(scan.nextLine());
            sum = sum+number;
        }
        System.out.println(sum);
    }
}
