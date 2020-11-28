package pb_first_moreexercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        double vegetablesPrice = 0;
        double fruitsPrice = 0;
        double vegetablesKG = 0;
        double fruitsKG = 0;
        Scanner scan = new Scanner(System.in);
        vegetablesPrice = Double.parseDouble(scan.nextLine());
        fruitsPrice = Double.parseDouble(scan.nextLine());
        vegetablesKG = Double.parseDouble(scan.nextLine());
        fruitsKG = Double.parseDouble(scan.nextLine());
        double income = vegetablesKG*vegetablesPrice+fruitsKG*fruitsPrice;
        System.out.printf("%.2f",income/1.94);
    }
}
