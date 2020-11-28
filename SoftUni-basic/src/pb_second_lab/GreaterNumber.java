package pb_second_lab;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner scan = new Scanner(System.in);
        a = Integer.parseInt(scan.nextLine());
        b = Integer.parseInt(scan.nextLine());
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
