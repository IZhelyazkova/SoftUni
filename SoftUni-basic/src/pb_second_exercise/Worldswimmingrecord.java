package pb_second_exercise;

import java.util.Scanner;

public class Worldswimmingrecord {
    public static void main(String[] args) {
        double record = 0;
        double distance = 0;
        double time = 0;

        Scanner scan = new Scanner(System.in);
        record = Double.parseDouble(scan.nextLine());
        distance = Double.parseDouble(scan.nextLine());
        time = Double.parseDouble(scan.nextLine());

        double ivanTime = distance * time;
        double delays = distance / 15;
        double delayTime = (int) delays * 12.5;
        ivanTime = ivanTime + delayTime;
        if (ivanTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivanTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", -record + ivanTime);
        }
    }
}
