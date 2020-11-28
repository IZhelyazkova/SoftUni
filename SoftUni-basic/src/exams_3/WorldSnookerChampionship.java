package exams_3;

import java.util.Scanner;

public class WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String stage = scan.nextLine();
        String ticketType = scan.nextLine();
        int tickets = Integer.parseInt(scan.nextLine());
        String picture = scan.nextLine();
        double price = 0;
        boolean pic = false;

        switch (stage) {
            case "Quarter final":
                if (ticketType.equals("Standard")) {
                    price = tickets * 55.50;
                } else if (ticketType.equals("Premium")) {
                    price = tickets * 105.20;
                } else {
                    price = tickets * 118.90;
                }
                break;
            case "Semi final":
                if (ticketType.equals("Standard")) {
                    price = tickets * 75.88;
                } else if (ticketType.equals("Premium")) {
                    price = tickets * 125.22;
                } else {
                    price = tickets * 300.40;
                }
                break;
            case "Final":
                if (ticketType.equals("Standard")) {
                    price = tickets * 110.10;
                } else if (ticketType.equals("Premium")) {
                    price = tickets * 160.66;
                } else {
                    price = tickets * 400.00;
                }
                break;
        }
        if (price > 4000) {
            price = price - (price * 0.25);
            pic = true;
        } else if (price > 2500) {
            price = price - (price * 0.10);
        }
        if (picture.equals("Y") && pic!=true) {
            price = price + (tickets*40);
        }
        System.out.printf("%.2f", price);
    }
}
