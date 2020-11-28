package pb_first_moreexercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        double x = 0;
        double y = 0;
        double h = 0;
        Scanner scan = new Scanner(System.in);
        x = Double.parseDouble(scan.nextLine());
        y = Double.parseDouble(scan.nextLine());
        h = Double.parseDouble(scan.nextLine());
        double housearea = 2 * (x * x) + 2 * (x * y) - 2 * (1.5 * 1.5) - (2 * 1.2);
        double roofarea = 2 * (x * y) + 2 * ((x * h) / 2);
        double green = housearea / 3.4;
        double red = roofarea / 4.3;
        System.out.printf("%.2f\n%.2f", green, red);
    }
}
