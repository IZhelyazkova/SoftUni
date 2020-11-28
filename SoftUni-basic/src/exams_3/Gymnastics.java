package exams_3;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String country = scan.nextLine();
        String equipment = scan.nextLine();

        double score = 0;

        switch (country) {
            case "Russia":
                if (equipment.equals("ribbon")) {
                    score = 9.1+9.4;
                } else if (equipment.equals("hoop")) {
                    score = 9.3+9.8;
                } else {
                    score = 9.6+9.0;
                }
                break;
            case "Bulgaria":
                if (equipment.equals("ribbon")) {
                    score = 9.6+9.4;
                } else if (equipment.equals("hoop")) {
                    score = 9.55+9.75;
                } else {
                    score = 9.5+9.4;
                }
                break;
            case "Italy":
                if (equipment.equals("ribbon")) {
                    score = 9.2+9.5;
                } else if (equipment.equals("hoop")) {
                    score = 9.45+9.35;
                } else {
                    score = 9.7+9.15;
                }
                break;
        }
        double percent = 100-(score/20*100);
        System.out.printf("The team of %s get %.3f on %s.\n",country,score,equipment);
        System.out.printf("%.2f%%",percent);
    }
}
