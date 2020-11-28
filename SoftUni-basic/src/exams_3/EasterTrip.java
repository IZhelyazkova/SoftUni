package exams_3;

import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String destination = scan.nextLine();
        String dates = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());
        double pricePerNight = 0;
        double priceTotal = 0;
        switch (destination) {
            case "France":
                if (dates.equals("21-23")) {
                    pricePerNight = 30.00;
                } else if (dates.equals("24-27")) {
                    pricePerNight = 35.00;
                } else {
                    pricePerNight = 40.00;
                }
                break;

            case "Italy":
                if (dates.equals("21-23")) {
                    pricePerNight = 28.00;
                } else if (dates.equals("24-27")) {
                    pricePerNight = 32.00;
                } else {
                    pricePerNight = 39.00;
                }
                break;

            case "Germany":
                if (dates.equals("21-23")) {
                    pricePerNight = 32.00;
                } else if (dates.equals("24-27")) {
                    pricePerNight = 37.00;
                } else {
                    pricePerNight = 43.00;
                }
                break;

        }
        priceTotal = nights * pricePerNight;
        System.out.printf("Easter trip to %s : %.2f leva.", destination, priceTotal);
    }
}
