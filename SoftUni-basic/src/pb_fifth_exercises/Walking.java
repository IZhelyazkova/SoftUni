package pb_fifth_exercises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int steps = 0;
        boolean goalReached = true;
        while (steps < 10000) {
            String input = scan.nextLine();
            if (input.equals("Going home")) {
                steps = steps + Integer.parseInt(scan.nextLine());
                if (steps < 10000) {
                    goalReached = false;
                }
                break;
            } else {
                steps = steps + Integer.parseInt(input);
            }
        }
        if (goalReached) {
            System.out.printf("Goal reached! Good job!\n%d steps over the goal!", (steps - 10000));
        } else {
            System.out.printf("%d more steps to reach goal.", (10000 - steps));
        }
    }
}
