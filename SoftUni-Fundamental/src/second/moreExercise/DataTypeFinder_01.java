package second.moreExercise;

import java.util.Scanner;

public class DataTypeFinder_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = "";
        while (!input.equals("END")) {

            input = scan.nextLine();
            if (input.equals("END")) {
                return;
            }

            if (input.matches("-?[0-9]+(\\.?)([0-9]+)?") && input.matches("[^a-zA-Z]+")) {
                if (input.contains(".")) {
                    System.out.printf("%s is floating point type%n", input);
                } else {
                    System.out.printf("%s is integer type%n", input);
                }
            } else {
                if (input.length() > 1) {
                    if (input.toLowerCase().equals("true") || input.toLowerCase().equals("false")) {
                        System.out.printf("%s is boolean type%n", input);
                    } else {
                        System.out.printf("%s is string type%n", input);
                    }
                } else {
                    System.out.printf("%s is character type%n", input);
                }
            }
        }
    }
}
