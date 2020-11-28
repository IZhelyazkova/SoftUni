package pb_first_moreexercises;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        String weather = "";
        Scanner scan = new Scanner(System.in);
        weather = scan.next();
        if (weather.equalsIgnoreCase("sunny")){
            System.out.println("It's warm outside!");
        }else{
            System.out.println("It's cold outside!");
        }
    }
}
