package pb_first_moreexercises;

import java.util.Scanner;

public class WeatherForecast2 {
    public static void main(String[] args) {
        double degrees = 0;
        Scanner scan = new Scanner(System.in);
        degrees = Double.parseDouble(scan.nextLine());
        if (degrees >= 26 && degrees <= 35) {
            System.out.println("Hot");
        } else if (degrees < 26 && degrees >= 20.1) {
            System.out.println("Warm");
        } else if (degrees < 20.1 && degrees >= 15) {
            System.out.println("Mild");
        }else if (degrees<15 && degrees >=12){
            System.out.println("Cool");
        }else if (degrees < 12 && degrees >= 5){
            System.out.println("Cold");
        }else
            System.out.println("unknown");
    }
}
