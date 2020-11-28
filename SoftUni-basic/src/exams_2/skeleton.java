package exams_2;

import java.util.Scanner;

public class skeleton {
    public static void main(String[] args) {
        int minutes = 0;
        int seconds = 0;
        double lenghtM = 0;
        int seconds100M = 0;
        double lowering = 0;


        Scanner scan = new Scanner(System.in);
        minutes = Integer.parseInt(scan.nextLine());
        seconds = Integer.parseInt(scan.nextLine());
        lenghtM = Double.parseDouble(scan.nextLine());
        seconds100M = Integer.parseInt(scan.nextLine());
        seconds = seconds+(minutes*60);
        if (lenghtM>=120) {
            lowering = lenghtM/120*2.5;
        }
        double totalSeconds = lenghtM/100*seconds100M-lowering;

        if (totalSeconds<=seconds){
            System.out.printf("Marin Bangiev won an Olympic quota!\nHis time is %.3f.",totalSeconds);
        }else{
            System.out.printf("No, Marin failed! He was %.3f second slower.",(totalSeconds-seconds));
        }

    }
}
