package first.exercise;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";
        String message = "";
        int letters = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < letters; i++) {
            int toAdd = 0;
            input = scan.nextLine();
            int lastDigit = Character.getNumericValue(input.charAt(input.length() - 1));
            if (lastDigit == 0) {
                toAdd = 32;
            } else if (lastDigit == 2) {
                toAdd = 95;
            } else if (lastDigit == 3) {
                toAdd = 97;
            } else if (lastDigit == 4) {
                toAdd = 99;
            } else if (lastDigit == 5) {
                toAdd = 101;
            } else if (lastDigit == 6) {
                toAdd = 103;
            } else if (lastDigit == 7) {
                toAdd = 105;
            } else if (lastDigit == 8) {
                toAdd = 108;
            } else if (lastDigit == 9) {
                toAdd = 110;
            }
            message += (char)(Character.getNumericValue(input.charAt(input.length() - 1)) + input.length() - 1 + toAdd);
        }
        System.out.println(message);
    }
}
