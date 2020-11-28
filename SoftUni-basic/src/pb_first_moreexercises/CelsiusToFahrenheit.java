package pb_first_moreexercises;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        double C = 0;
        Scanner scan = new Scanner(System.in);
        C = Double.parseDouble(scan.nextLine());
        double F = C*1.8+32;
        System.out.printf("%.2f",F);
    }
}
