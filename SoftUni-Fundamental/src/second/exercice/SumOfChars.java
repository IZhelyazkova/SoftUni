package second.exercice;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lines = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 0; i < lines; i++) {
            char input = scan.nextLine().charAt(0);
            sum = sum + input;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
