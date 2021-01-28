package third.lab;

import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        int day = Integer.parseInt(scan.nextLine());
        if (day > 0 && day < 8) {
            System.out.println(daysOfWeek[day - 1]);
        }else{
            System.out.println("Invalid day!");
        }
    }
}
