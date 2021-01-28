package third.lab;

import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < input.length; i++) {
            if (Integer.parseInt(input[i]) % 2 == 0) {
                sumEven += Integer.parseInt(input[i]);
            } else {
                sumOdd += Integer.parseInt(input[i]);
            }
        }
        System.out.println(sumEven-sumOdd);
    }
}
