package exams_1;

import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        int kozunak = 0;
        int eggs = 0;
        int cookies = 0;

        Scanner scan = new Scanner(System.in);

        kozunak = Integer.parseInt(scan.nextLine());
        eggs = Integer.parseInt(scan.nextLine());
        cookies = Integer.parseInt(scan.nextLine());

        int eggsT = eggs * 12;
        double kozunaksPrice = kozunak*3.20;
        double eggsPrice = eggs*4.35;
        double cookiesPrice = cookies*5.40;
        double colorPrice = eggsT*0.15;
        double total = kozunaksPrice+eggsPrice+cookiesPrice+colorPrice;
        System.out.printf("%.2f",total);
    }
}
