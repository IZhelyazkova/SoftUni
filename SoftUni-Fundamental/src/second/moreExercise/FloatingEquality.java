package second.moreExercise;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n1 = Double.parseDouble(scan.nextLine());
        double n2 = Double.parseDouble(scan.nextLine());
        double eps = 0.000001;

        double result = Math.abs(n1 - n2);
        if (result < eps) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
