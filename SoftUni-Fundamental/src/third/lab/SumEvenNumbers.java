package third.lab;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            if (Integer.parseInt(input[i]) % 2 == 0) {
                sum += Integer.parseInt(input[i]);
            }
        }
        System.out.println(sum);

    }
}
