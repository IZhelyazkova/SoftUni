package first.exercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        int d = 0;

        if (b > a) {
            d = a;
            a = b;
            b = d;
        }
        if (c > b) {
            d = b;
            b = c;
            c = d;
        }
        if (b > a) {
            d = a;
            a = b;
            b = d;
        }
        System.out.printf("%d%n%d%n%d%n", a, b, c);
    }
}
