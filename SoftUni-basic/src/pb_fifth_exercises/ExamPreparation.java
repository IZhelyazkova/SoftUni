package pb_fifth_exercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fails = Integer.parseInt(scan.nextLine());
        int fails2 = 0;
        int totalGrade = 0;
        int problems = 0;
        boolean itsEnough = false;
        String lastProblem = "";

        String input = "";

        while (!input.equals("Enough")) {
            input = scan.nextLine();
            if (!input.equals("Enough")) {
                lastProblem = input;
                int grade = Integer.parseInt(scan.nextLine());
                if (grade <= 4) {
                    fails--;
                    fails2++;
                    if (fails <= 0) {
                        System.out.printf("You need a break, %d poor grades.", fails2);
                        break;
                    }
                }
                totalGrade = totalGrade + grade;
                problems = problems + 1;
            } else {
                itsEnough = true;
                break;
            }
        }
        if (itsEnough == true) {
            System.out.printf("Average score: %.2f\nNumber of problems: %d\nLast problem: %s", ((double) totalGrade / (double) problems), problems, lastProblem);
        }
    }
}
