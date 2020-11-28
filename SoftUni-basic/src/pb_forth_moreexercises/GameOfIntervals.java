package pb_forth_moreexercises;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int moves = Integer.parseInt(scan.nextLine());
        double totalPoints = 0;
        int from0to9 = 0;
        int from10to19 = 0;
        int from20to29 = 0;
        int from30to39 = 0;
        int from40to50 = 0;
        int invalid = 0;

        for (int i = 0; i < moves; i++) {
            int input = Integer.parseInt(scan.nextLine());
            if (input < 0 || input > 50) {
                invalid++;
                totalPoints = totalPoints / 2;
            } else if (input >= 40) {
                from40to50++;
                totalPoints = totalPoints + 100;
            } else if (input >= 30) {
                from30to39++;
                totalPoints = totalPoints + 50;
            } else if (input >= 20) {
                from20to29++;
                totalPoints = totalPoints + (input * 0.4);
            } else if (input >= 10) {
                from10to19++;
                totalPoints = totalPoints + (input * 0.3);
            } else {
                from0to9++;
                totalPoints = totalPoints + (input * 0.2);
            }
        }
        System.out.printf("%.2f\n", totalPoints);
        System.out.printf("From 0 to 9: %.2f%%\n", (double)from0to9/(double) moves*100);
        System.out.printf("From 10 to 19: %.2f%%\n", (double)from10to19/(double) moves*100);
        System.out.printf("From 20 to 29: %.2f%%\n", (double)from20to29/(double) moves*100);
        System.out.printf("From 30 to 39: %.2f%%\n", (double)from30to39/(double) moves*100);
        System.out.printf("From 40 to 50: %.2f%%\n", (double)from40to50/(double) moves*100);
        System.out.printf("Invalid numbers: %.2f%%", (double)invalid/(double) moves*100);

    }
}
