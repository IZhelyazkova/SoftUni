package exams_2;

import java.util.Scanner;

public class mountainRun {
    public static void main(String[] args) {
        double record = 0;
        double distanceM = 0;
        double mforSec = 0;

        Scanner scan = new Scanner(System.in);
        record = Double.parseDouble(scan.nextLine());
        distanceM = Double.parseDouble(scan.nextLine());
        mforSec = Double.parseDouble(scan.nextLine());

        double delay = Math.floor(distanceM/50)*30;
        double totalTime = distanceM*mforSec+delay;
        if (totalTime<record){
            System.out.printf("Yes! The new record is %.2f seconds.",totalTime);
        }else{
            System.out.printf("No! He was %.2f seconds slower.",(-record+totalTime));
        }

    }
}
