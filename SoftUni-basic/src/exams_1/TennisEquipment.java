package exams_1;

import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        double tenisRacketP = 0;
        int tenisRackets = 0;
        int sneekers = 0;

        Scanner scan = new Scanner(System.in);

        tenisRacketP = Double.parseDouble(scan.nextLine());
        tenisRackets = Integer.parseInt(scan.nextLine());
        sneekers = Integer.parseInt(scan.nextLine());

        double sneekersP = tenisRacketP / 6;

        double tenisRacketsPTotal = tenisRacketP * tenisRackets;
        double sneekersPTotal = sneekers * sneekersP;
        double other = (tenisRacketsPTotal + sneekersPTotal) * 0.2;
        double total = tenisRacketsPTotal + sneekersPTotal + other;
        System.out.printf("Price to be paid by Djokovic %.0f\nPrice to be paid by sponsors %.0f", Math.floor(total/8), Math.ceil(total/8*7));

    }
}
