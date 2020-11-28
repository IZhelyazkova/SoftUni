package exams_1;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        int pens = 0;
        int markers = 0;
        double litre = 0;
        double discount = 0;

        Scanner scan = new Scanner(System.in);
        pens = Integer.parseInt(scan.nextLine());
        markers = Integer.parseInt(scan.nextLine());
        litre = Double.parseDouble(scan.nextLine());
        discount = Double.parseDouble(scan.nextLine());

        double pensPrice = pens * 5.80;
        double markersPrice = markers * 7.20;
        double cleaningPrice = litre * 1.20;

        double totalPrice = pensPrice + markersPrice + cleaningPrice - ((pensPrice + markersPrice + cleaningPrice) * discount / 100);
        System.out.printf("%.3f", totalPrice);
    }
}
