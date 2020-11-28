package pb_first_moreexercises;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        double r = 0;
        Scanner scan = new Scanner(System.in);
        r = Double.parseDouble(scan.nextLine());
        double area = Math.PI*r*r;
        double parameter = 2*Math.PI*r;
        System.out.printf("%.2f%n%.2f",area,parameter);
    }
}
