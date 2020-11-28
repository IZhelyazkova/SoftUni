package pb_first_exercise;

import java.util.Scanner;

public class Charity {
    public static void main(String[] args) {
        int days = 0;
        int bakers = 0;
        int cakes = 0;
        int waffle = 0;
        int pancakes = 0;
        Scanner scan = new Scanner(System.in);
        days = Integer.parseInt(scan.nextLine());
        bakers = Integer.parseInt(scan.nextLine());
        cakes = Integer.parseInt(scan.nextLine());
        waffle = Integer.parseInt(scan.nextLine());
        pancakes = Integer.parseInt(scan.nextLine());

        int cakesT = days * bakers * cakes;
        int waffleT = days * bakers * waffle;
        int pancakesT = days * bakers * pancakes;

        double cakesPrice = cakesT*45.0;
        double wafflePrice = waffleT*5.80;
        double pancakesPrice = pancakesT*3.20;
        double total = cakesPrice+wafflePrice+pancakesPrice;

        System.out.printf("%.2f",total-(total/8));
    }
}
