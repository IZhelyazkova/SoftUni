package pb_third_lab;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = Double.parseDouble(scan.nextLine());

        if (number > 200 || (number < 100 && number != 0)){
            System.out.println("invalid");
        }

    }
}
