package pb_second_moreexercises;

import java.util.Scanner;

public class sleepyTomCat {
    public static void main(String[] args) {
        int daysOff = 0;

        Scanner scan = new Scanner(System.in);
        daysOff = Integer.parseInt(scan.nextLine());

        int workingDays = 365-daysOff;
        int minutes = workingDays*63 + daysOff*127;
        if (minutes<30000){
            int hLeft = (30000-minutes)/60;
            int mLeft = (30000-minutes)%60;
            System.out.printf("Tom sleeps well\n%d hours and %d minutes less for play",hLeft, mLeft);
        }else{
            int H = (minutes-30000)/60;
            int mLeft = (minutes-30000)%60;
            System.out.printf("Tom will run away\n%d hours and %d minutes more for play",H,mLeft);
        }
    }
}
