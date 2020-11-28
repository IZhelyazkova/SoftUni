package pb_first_exercise;

import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        double Price = 0;
        double babanasKG = 0;
        double orangesKG = 0;
        double raspberryKg = 0;
        double strawberryKG = 0;
        Scanner scan = new Scanner(System.in);

        Price = Double.parseDouble(scan.nextLine());
        babanasKG = Double.parseDouble(scan.nextLine());
        orangesKG = Double.parseDouble(scan.nextLine());
        raspberryKg = Double.parseDouble(scan.nextLine());
        strawberryKG = Double.parseDouble(scan.nextLine());

        double raspberryPR = Price/2;

        double strawberryPrice = Price*strawberryKG;
        double raspberryPrice = raspberryPR*raspberryKg;
        double orangesPrice = (raspberryPR/100*60)*orangesKG;
        double bananasPrice = (raspberryPR/100*20)*babanasKG;

        System.out.printf("%.2f",strawberryPrice+raspberryPrice+orangesPrice+bananasPrice);
    }
}
