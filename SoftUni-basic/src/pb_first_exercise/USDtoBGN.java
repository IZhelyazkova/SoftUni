package pb_first_exercise;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        double usd;
        Scanner scan = new Scanner(System.in);
        usd = Double.parseDouble(scan.nextLine());
        System.out.println(usd*1.79549);
    }
}
