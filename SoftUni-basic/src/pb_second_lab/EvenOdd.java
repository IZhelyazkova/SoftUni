package pb_second_lab;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int a = 0;
        Scanner scan = new Scanner(System.in);
        a = Integer.parseInt(scan.nextLine());
        if (a % 2 != 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }

    }
}
