package exams_1;

import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        double floorPrice = 0;
        double floorKg = 0;
        double sugarKg = 0;
        int eggs = 0;
        int yeast = 0;

        Scanner scan = new Scanner(System.in);

        floorPrice = Double.parseDouble(scan.nextLine());
        floorKg = Double.parseDouble(scan.nextLine());
        sugarKg = Double.parseDouble(scan.nextLine());
        eggs = Integer.parseInt(scan.nextLine());
        yeast = Integer.parseInt(scan.nextLine());

        double sugarPrice = floorPrice - (floorPrice * 0.25);
        double eggsPrice = floorPrice + (floorPrice * 0.1);
        double yeastPrice = sugarPrice - (sugarPrice * 0.8);

        double total = sugarKg * sugarPrice + eggsPrice * eggs + yeastPrice * yeast+floorKg*floorPrice;
        System.out.printf("%.2f",total);
    }
}
