package pb_fifth_moreexercises;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + Double.parseDouble(scan.nextLine());
        }
        System.out.printf("%.2f", (sum / n));
    }
}
