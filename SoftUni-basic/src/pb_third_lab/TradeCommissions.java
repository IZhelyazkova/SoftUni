package pb_third_lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());
        double commision = 0;
        switch (town) {
            case "Sofia":
                if (sales < 0) {
                    System.out.println("error");
                }
                else if (sales >= 0 && sales <= 500) {
                    commision = 5.0 / 100 * sales;
                } else if (sales <= 1000) {
                    commision = 7.0 / 100 * sales;
                } else if (sales <= 10000) {
                    commision = 8.0 / 100 * sales;
                } else if (sales > 10000) {
                    commision = 12.0 / 100 * sales;
                }
                break;
            case "Varna":
                if (sales < 0) {
                    System.out.println("error");
                }else if (sales >= 0 && sales <= 500) {
                    commision = 4.5 / 100 * sales;
                } else if (sales <= 1000) {
                    commision = 7.5 / 100 * sales;
                } else if (sales <= 10000) {
                    commision = 10.0 / 100 * sales;
                } else if (sales > 10000) {
                    commision = 13.0 / 100 * sales;
                }
                break;
            case "Plovdiv":
                if (sales < 0) {
                    System.out.println("error");
                }else if (sales >= 0 && sales <= 500) {
                    commision = 5.5 / 100 * sales;
                } else if (sales <= 1000) {
                    commision = 8.0 / 100 * sales;
                } else if (sales <= 10000) {
                    commision = 12.0 / 100 * sales;
                } else if (sales > 10000) {
                    commision = 14.5 / 100 * sales;
                }
                break;
            default:
                System.out.println("error");
                break;
        }
        if (commision>0){
            System.out.printf("%.2f",commision);
        }
    }
}
