package pb_first_moreexercises;

import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {
        double b1 = 0;
        double b2 = 0;
        double h = 0;
        Scanner scan = new Scanner(System.in);
         b1 = Double.parseDouble(scan.nextLine());
         b2 = Double.parseDouble(scan.nextLine());
         h = Double.parseDouble(scan.nextLine());
        double area = ((b1+b2)*h)/2.0;
        System.out.printf("%.2f",area);
    }
}
