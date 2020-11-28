package pb_second_moreexercises;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        int hoursNeeded = 0;
        int days = 0;
        int workers = 0;

        Scanner scan = new Scanner(System.in);
        hoursNeeded = Integer.parseInt(scan.nextLine());
        days = Integer.parseInt(scan.nextLine());
        workers = Integer.parseInt(scan.nextLine());


        double totalWork = (days*0.9)*8+(workers*2.0*days);

        if (totalWork<hoursNeeded){
            System.out.printf("Not enough time!%.0f hours needed.",hoursNeeded - Math.floor(totalWork));
        }else {
            System.out.printf("Yes!%.0f hours left.",Math.floor(totalWork)- hoursNeeded);
        }

    }
}