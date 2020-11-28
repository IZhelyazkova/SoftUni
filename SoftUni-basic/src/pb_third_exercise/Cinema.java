package pb_third_exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String movie = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int colums = Integer.parseInt(scan.nextLine());
        double price = 0;
        if (movie.equals("Premiere")) {
            price = (rows * colums) * 12.00;

        } else if (movie.equals("Normal")) {
            price = (rows * colums) * 7.50;
        } else {
            price = (rows * colums) * 5.00;
        }
        System.out.printf("%.2f leva", price);
    }
}
