package pb_first_exercise;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        int price = 0;
        Scanner scan = new Scanner(System.in);
        price = Integer.parseInt(scan.nextLine());
        double cake = price/5;
        double drinks = cake/100*55;
        double animator = price/3;
        System.out.println(price+cake+drinks+animator);
    }
}
