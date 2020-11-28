package pb_sixth_exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jury = Integer.parseInt(scan.nextLine());

        String input = "";
        double totalSum = 0;
        int totalCount = 0;

        while (!input.equals("Finish")) {
            input = scan.nextLine();
            if (input.equals("Finish")) {
                break;
            } else {
                int count = 0;
                double sum = 0;
                for (int i = 1; i <= jury; i++) {
                    count++;
                    sum = sum + Double.parseDouble(scan.nextLine());
                }
                totalSum = totalSum + sum;
                totalCount = totalCount + count;
                System.out.printf("%s - %.2f.\n", input, (sum / count));
            }
        }
        System.out.printf("Student's final assessment is %.2f.", totalSum / totalCount);
    }
}
