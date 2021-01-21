package second.exercice;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        long sum = 0;

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scan.nextLine());
            if (input <= 255 && 255 >= (sum + input)) {
                sum = sum + input;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(sum);
    }
}
