package pb_second_moreexercises;

import java.util.Scanner;

public class fuelTank {
    public static void main(String[] args) {
        String fuelType = "";
        double fuelLitter = 0;

        Scanner scan = new Scanner(System.in);

        fuelType = scan.nextLine();
        fuelLitter = Double.parseDouble(scan.nextLine());

        if (fuelType.equals("Diesel") || fuelType.equals("Gasoline") || fuelType.equals("Gas")) {
            if (fuelLitter >= 25) {
                System.out.printf("You have enough %s.", fuelType.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
            }
        } else {
            System.out.println("Invalid fuel!");
        }


    }

}

