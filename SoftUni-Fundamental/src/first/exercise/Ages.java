package first.exercise;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());
        String personIs = "";
        if (age >= 0 && age <= 2) {
            personIs = "baby";
        } else if (age > 2 && age <= 13) {
            personIs = "child";
        } else if (age > 13 && age <= 19) {
            personIs = "teenager";
        } else if (age > 19 && age <= 65) {
            personIs = "adult";
        } else if (age > 65) {
            personIs = "elder";
        }
        System.out.println(personIs);
    }
}
