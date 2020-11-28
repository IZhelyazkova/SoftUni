package pb_first_moreexercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        double skumriyaP = 0;
        double cacaP = 0;
        double kgPalamud = 0;
        double kgSafrid = 0;
        int kgMidi = 0;
        Scanner scan = new Scanner(System.in);
        skumriyaP = Double.parseDouble(scan.nextLine());
        cacaP = Double.parseDouble(scan.nextLine());
        kgPalamud = Double.parseDouble(scan.nextLine());
        kgSafrid = Double.parseDouble(scan.nextLine());
        kgMidi = Integer.parseInt(scan.nextLine());
        double palamudPrice = skumriyaP+(skumriyaP/100*60);
        double safridPrice = cacaP+(cacaP/5*4);
        double total = kgPalamud*palamudPrice+kgSafrid*safridPrice+kgMidi*7.50;
        System.out.printf("%.2f",total);
    }
}
