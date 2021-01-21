package second.lab;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = "";
        String output = "";
        for (int i = 0; i < 3; i++) {
            input = input + scan.nextLine();
        }
        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
            if (i != 0) {
                output += " ";
            }
        }
        System.out.println(output);
    }
}
