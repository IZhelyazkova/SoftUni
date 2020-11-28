package pb_first_exercise;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double rad = Double.parseDouble(scan.nextLine());
        // double P = Math.PI;
        double degrees = rad*180.0/Math.PI;
        System.out.println(Math.floor(degrees));
    }
}
