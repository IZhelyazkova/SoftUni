package pb_second_exercise;

import java.util.Scanner;

public class time_15minutes {
    public static void main(String[] args) {
        int hours = 0;
        int minutes = 0;

        Scanner scan = new Scanner(System.in);

        hours = Integer.parseInt(scan.nextLine());
        minutes = Integer.parseInt(scan.nextLine());

        int minutesAfter = minutes + 15;

        if (minutesAfter > 59) {
            hours++;
            if (hours>23){
                hours = 0;
            }
            minutes = minutesAfter - 60;
        } else {
            minutes = minutesAfter;
        }
        if (minutes < 10) {
            System.out.printf("%d:0%d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);
        }
    }
}
