package exams_2;

import java.util.Scanner;

public class catWalking {
    public static void main(String[] args) {
        int minutesWalk = 0;
        int walksPerDay = 0;
        int calories = 0;
        Scanner scan = new Scanner(System.in);

        minutesWalk = Integer.parseInt(scan.nextLine());
        walksPerDay = Integer.parseInt(scan.nextLine());
        calories = Integer.parseInt(scan.nextLine());

        int totalWalkingCalories = walksPerDay*minutesWalk*5;

        if (calories/2<=totalWalkingCalories){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",totalWalkingCalories);
        }else{
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", totalWalkingCalories);
        }

    }
}
