package first.lab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        minutes = minutes + 30;

        if (minutes > 59) {
            hours++;
            minutes = minutes - 60;
            if (hours > 23) {
                hours = hours-24;
            }
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}
