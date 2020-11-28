package first.exercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        int n = Integer.parseInt(number);
        int sum = 0;
        int toAdd = 1;
        for (int i = 0; i < number.length(); i++) {
            for (int j = 1; j <= Character.getNumericValue(number.charAt(i)); j++) {
                toAdd *= j;
            }
            sum += toAdd;
            toAdd = 1;
        }
        if (sum == n) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
