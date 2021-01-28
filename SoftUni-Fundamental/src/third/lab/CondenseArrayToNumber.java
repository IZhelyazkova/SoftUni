package third.lab;

import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        for (int j = 0; j < input.length - 1; j++) {
            for (int i = 0; i < input.length - j - 1; i++) {
                input[i] = "" + (Integer.parseInt(input[i]) + Integer.parseInt(input[i + 1]));
            }
        }
        System.out.println(input[0]);
    }
}
