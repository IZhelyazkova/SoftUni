package second.lab;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            String input = "";
            input = input + i;
            for (int j = 0; j <= input.length()-1; j++) {
                sum = sum + Character.getNumericValue(input.charAt(j));
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(input + " -> True");
            } else {
                System.out.println(input + " -> False");
            }
            input = "";
            sum = 0;
        }
    }
}
