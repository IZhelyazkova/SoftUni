package pb_third_exercise;

import java.util.Scanner;

public class OnTimefortheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hourExamp = Integer.parseInt(scan.nextLine());
        int minutesExamp = Integer.parseInt(scan.nextLine());
        int hourArrive = Integer.parseInt(scan.nextLine());
        int minutesArrive = Integer.parseInt(scan.nextLine());

        minutesExamp = minutesExamp + hourExamp * 60;
        minutesArrive = minutesArrive + hourArrive * 60;
        if(minutesArrive == minutesExamp){
            System.out.println("On time");
        } else if (minutesArrive > minutesExamp) {
            System.out.println("Late");
            if (minutesArrive - minutesExamp < 60) {
                System.out.printf("%d minutes after the start", (minutesArrive - minutesExamp));
            } else {
                int hours = (minutesArrive - minutesExamp) / 60;
                int minutes = (minutesArrive - minutesExamp) % 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }
        } else if (minutesExamp - minutesArrive <= 30) {
            System.out.println("On time");
            System.out.printf("%d minutes before the start", Math.abs(minutesArrive - minutesExamp));
        } else {
            System.out.println("Early");
            if (minutesExamp - minutesArrive < 60){
                System.out.printf("%d minutes before the start", (minutesExamp-minutesArrive));
            }else{
                int hours = (minutesExamp-minutesArrive) / 60;
                int minutes = (minutesExamp-minutesArrive) % 60;
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            }
        }
    }
}


