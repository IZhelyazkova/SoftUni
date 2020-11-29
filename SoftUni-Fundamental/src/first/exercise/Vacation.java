package first.exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String day = scan.nextLine();

        double totalPrice = 0;
        double priceForOne = 0;
        double discount = 0;

        switch (type) {
            case "Students":
                if (n >= 30) {
                    discount = 0.15;
                }
                if (day.equals("Friday")) {
                    priceForOne = 8.45;
                } else if (day.equals("Saturday")) {
                    priceForOne = 9.80;
                } else if (day.equals("Sunday")) {
                    priceForOne = 10.46;
                }
                break;

            case "Business":
                if (n >= 100) {
                    n -= 10;
                }
                if (day.equals("Friday")) {
                    priceForOne = 10.90;
                } else if (day.equals("Saturday")) {
                    priceForOne = 15.60;
                } else if (day.equals("Sunday")) {
                    priceForOne = 16;
                }

                break;

            case "Regular":
                if (n >= 10 && n <= 20) {
                    discount = 0.05;
                }
                if (day.equals("Friday")) {
                    priceForOne = 15;
                } else if (day.equals("Saturday")) {
                    priceForOne = 20;
                } else if (day.equals("Sunday")) {
                    priceForOne = 22.5;
                }
                break;
        }
        totalPrice = n * priceForOne * (1 - discount);
        System.out.printf("Total price: %.2f%n", totalPrice);
    }
}
