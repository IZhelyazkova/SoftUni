package pb_second_lab;

import java.util.Scanner;

public class FaceOfaFigure {
    public static void main(String[] args) {
        String face1 = "square";
        String face2 = "rectangle";
        String face3 = "circle";
        String face4 = "triangle";
        String theface = "";
        double a = 0;
        double b = 0;
        Scanner scan = new Scanner(System.in);
        theface = scan.nextLine();
        if (theface.equalsIgnoreCase(face1)) {
            a = Double.parseDouble(scan.nextLine());
            System.out.printf("%.3f",a * a);
        } else if (theface.equals(face2)) {
            a = Double.parseDouble(scan.nextLine());
            b = Double.parseDouble(scan.nextLine());
            System.out.printf("%.3f",a * b);
        } else if (theface.equals(face3)) {
            a = Double.parseDouble(scan.nextLine());
            System.out.printf("%.3f",Math.PI * a * a);
        } else {
            a = Double.parseDouble(scan.nextLine());
            b = Double.parseDouble(scan.nextLine());
            System.out.printf("%.3f",(a * b) / 2);
        }

    }
}
