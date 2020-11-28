package pb_forth_lab;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int number = Integer.parseInt(scan.nextLine());
        int max = number,min = number;
        for (int i = 1; i < n; i++) {
            number = Integer.parseInt(scan.nextLine());
            if (number < min) {
                min = number;
            } else if (number > max) {
                max = number;
            }
        }
        System.out.printf("Max number: %d\nMin number: %d", max, min);
    }
}
