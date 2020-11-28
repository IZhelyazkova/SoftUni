package pb_second_exercise;

import java.util.Scanner;

public class scholarship {
    public static void main(String[] args) {
        double income = 0;
        double grade = 0;
        double minimum = 0;

        double biggerScolarship = 0;

        double hh = 146.49;
        System.out.println(Math.floor(hh));
        System.out.printf("%.2f\n",hh);
        System.out.println(Math.round(hh));
        System.out.println(Math.ceil(hh));
        System.out.printf("");

        Scanner scan = new Scanner(System.in);
        income = Double.parseDouble(scan.nextLine());
        grade = Double.parseDouble(scan.nextLine());
        minimum = Double.parseDouble(scan.nextLine());


        if (grade > 4.5) {
            if (income >= minimum) {
                if (grade >= 5.5) {
                    double scolarship = Math.floor(grade * 25);
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", scolarship);
                } else {
                    System.out.println("You cannot get a scholarship!");
                }
            } else {
                if (grade >= 5.5) {
                    double scholarshipSoc = Math.floor(minimum * 0.35);
                    double scolarshipEx = Math.floor(grade * 25);
                    biggerScolarship = Math.max(scolarshipEx, scholarshipSoc);
                    if (scolarshipEx > scholarshipSoc) {
                        System.out.printf("You get a scholarship for excellent results %.0f BGN", biggerScolarship);
                    } else {
                        System.out.printf("You get a Social scholarship %.0f BGN", biggerScolarship);
                    }
                } else {
                    double scolarship = Math.floor(minimum * 0.35);
                    System.out.printf("You get a Social scholarship %.0f BGN",scolarship);
                }
            }
        } else {
            System.out.println("You cannot get a scholarship!");
        }

    }
}

