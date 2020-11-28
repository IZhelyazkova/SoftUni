package pb_first_lab;

import java.util.Scanner;

public class InchtoSm {
    public static void main(String[] args) {
        double inch;
        Scanner scan = new Scanner(System.in);
        inch = Double.parseDouble(scan.nextLine());
        System.out.println(inch*2.54);
    }
}
