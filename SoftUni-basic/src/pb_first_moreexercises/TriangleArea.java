package pb_first_moreexercises;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        double a = 0;
        double h = 0;
        Scanner scan = new Scanner(System.in);
        a = Double.parseDouble(scan.nextLine());
        h = Double.parseDouble(scan.nextLine());
        double area = (a * h) / 2;
        System.out.printf("%.2f", area);
    }
}
