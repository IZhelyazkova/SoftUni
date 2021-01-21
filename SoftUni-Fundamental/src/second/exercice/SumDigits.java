package second.exercice;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int sum = 0;

        for (int i = 0; i < input.length() ; i++) {
            sum = sum + Character.getNumericValue(input.charAt(i));
        }
        System.out.println(sum);
    }
}
