package EXAM_1;

import java.util.Scanner;

public class PassengersPerFlight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int companies = Integer.parseInt(scan.nextLine());
        String companyTop = "";
        int countTop = 0;
        String input = "";
        int totalPassenger = 0;
        int count = 0;

        for (int i = 1; i <= companies; i++) {
            String company = scan.nextLine();

            while (!input.equals("Finish")) {
                input = scan.nextLine();
                if (input.equals("Finish")) {
                    break;
                } else {
                    int passngers = Integer.parseInt(input);
                    totalPassenger = totalPassenger + passngers;
                    count++;
                }
            }
            System.out.printf("%s: %.0f passengers.\n", company, Math.floor(totalPassenger * 1.0 / count));
            if (Math.round(totalPassenger * 1.0 / count) > countTop) {
                countTop = (int) Math.floor(totalPassenger * 1.0 / count);
                companyTop = company;
            }
            totalPassenger = 0;
            count = 0;
            input = "";
        }
        System.out.printf("%s has most passengers per flight: %d", companyTop, countTop);

    }

}


