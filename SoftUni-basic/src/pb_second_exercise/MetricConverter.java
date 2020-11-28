package pb_second_exercise;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        double number = 0;
        String input = "";
        String output = "";

        Scanner scan = new Scanner(System.in);

        number = Double.parseDouble(scan.nextLine());
        input = scan.nextLine();
        output = scan.nextLine();

        double numOutput = 0;

        if (input.equalsIgnoreCase("m")) {
            if (output.equals("cm")) {
                numOutput = number * 100;
            } else {
                numOutput = number * 1000;
            }
        } else if (input.equals("cm")) {
            if (output.equals("mm")) {
                numOutput = number * 10;
            } else {
                numOutput = number / 100;
            }
        } else {
            if (output.equals("cm")) {
                numOutput = number / 10;
            } else {
                numOutput = number / 1000;
            }
        }
        System.out.printf("%.3f",numOutput);
    }
}
