package exams_1;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        int bitcoins = 0;
        double ioans = 0;
        double commision = 0;
        Scanner scan = new Scanner(System.in);
        bitcoins = Integer.parseInt(scan.nextLine());
        ioans = Double.parseDouble(scan.nextLine());
        commision = Double.parseDouble(scan.nextLine());
        double leva = bitcoins*1168;
        double USD = ioans*0.15;
        leva = leva+USD*1.76;
        double EUR = leva/1.95;
        EUR = EUR-(EUR*commision/100);
        System.out.printf("%.2f",EUR);
    }
}
