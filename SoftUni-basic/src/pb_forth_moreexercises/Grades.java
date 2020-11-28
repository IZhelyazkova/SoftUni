package pb_forth_moreexercises;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int students = Integer.parseInt(scan.nextLine());

        int over5 = 0;
        int over4 = 0;
        int over3 = 0;
        int over2 = 0;
        double totalScore = 0;

        for (int i = 0; i < students; i++) {
            double grade = Double.parseDouble(scan.nextLine());
            if (grade >= 5) {
                over5++;
                totalScore = totalScore + grade;
            } else if (grade >= 4) {
                over4++;
                totalScore = totalScore + grade;
            } else if (grade >= 3) {
                over3++;
                totalScore = totalScore + grade;
            } else {
                over2++;
                totalScore = totalScore + grade;
            }
        }
        double avarageGrade = totalScore / students;
        System.out.printf("Top students: %.2f%%\n", (double) over5 / (double) students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", (double) over4 / (double) students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", (double) over3 / (double) students * 100);
        System.out.printf("Fail: %.2f%%\n", (double) over2 / (double) students * 100);
        System.out.printf("Average: %.2f", avarageGrade);

    }
}
