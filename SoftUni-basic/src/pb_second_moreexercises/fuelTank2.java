package pb_second_moreexercises;

import java.util.Scanner;

public class fuelTank2 {
    public static void main(String[] args) {
        String fuelType = "";
        double fuelL = 0;
        String card = "";
        double fuelPrice = 0;
        double discount = 0;

        Scanner scan = new Scanner(System.in);
        fuelType = scan.nextLine();
        fuelL = Double.parseDouble(scan.nextLine());
        card = scan.nextLine();

        if (fuelL >= 20 && fuelL <= 25) {
            discount = 8.0 / 100;
        } else if (fuelL > 25) {
            discount = 10.0 / 100;
        }

        if (fuelType.equals("Gasoline")) {
            fuelPrice = fuelL * 2.22;
            if (card.equals("Yes")) {
                fuelPrice = fuelPrice - (fuelL * 0.18);
            }
            fuelPrice = fuelPrice - (fuelPrice * discount);
        } else if (fuelType.equals("Diesel")) {
            fuelPrice = fuelL * 2.33;
            if (card.equals("Yes")) {
                fuelPrice = fuelPrice - (fuelL * 0.12);
            }
            fuelPrice = fuelPrice - (fuelPrice * discount);
        } else {
            fuelPrice = fuelL * 0.93;
            if (card.equals("Yes")) {
                fuelPrice = fuelPrice - (fuelL * 0.08);
            }
            fuelPrice = fuelPrice - (fuelPrice * discount);
        }
        System.out.printf("%.2f lv.",fuelPrice);
    }
}
