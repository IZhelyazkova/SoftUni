package pb_fifth_lab;

import java.util.Scanner;

public class Graduationpt2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int count = 1;
        int fails = 0;
        double totalGrade = 0;
        while (count <= 12) {
            double grade = Double.parseDouble(scan.nextLine());
            if (grade >= 4) {
                totalGrade = totalGrade + grade;
                count++;
            } else {
                fails++;
            }
            if (fails >= 2) {
                System.out.printf("%s has been excluded at %d grade", name, count);
                break;
            }

        }
        if (count >= 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, (totalGrade / 12.0));
        }

    }
}
