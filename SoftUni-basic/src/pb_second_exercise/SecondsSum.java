package pb_second_exercise;

import java.util.Scanner;

public class SecondsSum {
    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        int third = 0;
        Scanner scan = new Scanner(System.in);

        first = Integer.parseInt(scan.nextLine());
        second = Integer.parseInt(scan.nextLine());
        third = Integer.parseInt(scan.nextLine());

        int total = first + second + third;
        int min = total / 60;
        int sec = total % 60;
        if (sec < 10) {
            System.out.printf("%d:0%d", min, sec);
        } else {
            System.out.printf("%d:%d", min, sec);
        }
    }
}
