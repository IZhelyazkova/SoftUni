package first.lab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int count = 0;
        int sum = 0;

        for (int i = 1; count < n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum = sum + i;
                count++;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
