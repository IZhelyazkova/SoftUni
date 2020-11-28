package pb_forth_exercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int under200 = 0;
        int btw200And399 = 0;
        int btw400And599 = 0;
        int btw600And799 = 0;
        int overAnd800 = 0;
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number >= 800) {
                overAnd800++;
            } else if (number >= 600) {
                btw600And799++;
            } else if (number >= 400) {
                btw400And599++;
            } else if (number >= 200) {
                btw200And399++;
            } else {
                under200++;
            }
        }
        double p1 = under200 / (double)n * 100.00;
        double p2 = btw200And399 / (double)n * 100.00;
        double p3 = btw400And599 / (double)n * 100.00;
        double p4 = btw600And799 / (double)n * 100.00;
        double p5 = overAnd800 / (double)n * 100.00;
        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%", p1, p2, p3, p4, p5);
    }
}
