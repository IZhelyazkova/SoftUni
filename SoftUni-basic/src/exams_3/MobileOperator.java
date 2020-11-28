package exams_3;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String years = scan.nextLine();
        String type = scan.nextLine();
        String net = scan.nextLine();
        int months = Integer.parseInt(scan.nextLine());
        double pricePerMonth = 0;
        double priceForNet = 0;
        double totalPrice = 0;
        switch (years) {
            case "one":
                if (type.equals("Small")) {
                    pricePerMonth = 9.98;
                    priceForNet = 5.50;
                } else if (type.equals("Middle")) {
                    pricePerMonth = 18.99;
                    priceForNet = 4.35;
                } else if (type.equals("Large")) {
                    pricePerMonth = 25.98;
                    priceForNet = 4.35;
                } else {
                    pricePerMonth = 35.99;
                    priceForNet = 3.85;
                }
                break;
            case "two":
                if (type.equals("Small")) {
                    pricePerMonth = 8.58;
                    priceForNet = 5.50;
                } else if (type.equals("Middle")) {
                    pricePerMonth = 17.09;
                    priceForNet = 4.35;
                } else if (type.equals("Large")) {
                    pricePerMonth = 23.59;
                    priceForNet = 4.35;
                } else {
                    pricePerMonth = 31.79;
                    priceForNet = 3.85;
                }
                break;

        }
        if (net.equals("no")){
            totalPrice = months*pricePerMonth;
        }else{
            totalPrice = months*(pricePerMonth+priceForNet);
        }
        if (years.equals("two")){
            totalPrice = totalPrice-(totalPrice*0.0375);
        }
        System.out.printf("%.2f lv.",totalPrice);
    }
}
