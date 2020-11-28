package exams_3;

import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String size = scan.nextLine();
        String color = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());

        double pricePerCount = 0;
        double totalPrice = 0;

        switch (size) {
            case "Large":
                if (color.equals("Red")) {
                    pricePerCount = 16.00;
                } else if (color.equals("Green")) {
                    pricePerCount = 12.00;
                } else {
                    pricePerCount = 9.00;
                }
                break;

            case "Medium":
                if (color.equals("Red")) {
                    pricePerCount = 13.00;
                } else if (color.equals("Green")) {
                    pricePerCount = 9.00;
                } else {
                    pricePerCount = 7.00;
                }
                break;

            case "Small":
                if (color.equals("Red")) {
                    pricePerCount = 9.00;
                } else if (color.equals("Green")) {
                    pricePerCount = 8.00;
                } else {
                    pricePerCount = 5.00;
                }
                break;
        }
        totalPrice = pricePerCount * count;
        totalPrice = totalPrice - (totalPrice * 0.35);
        System.out.printf("%.2f leva.",totalPrice);
    }
}
