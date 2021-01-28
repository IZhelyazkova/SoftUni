package third.lab;

import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input1 = scan.nextLine().split(" ");
        String[] input2 = scan.nextLine().split(" ");
        int sum = 0;
        boolean identical = true;

            for (int i = 0; i < input1.length; i++) {
                if (input1[i].equals(input2[i])) {
                    sum += Integer.parseInt(input1[i]);
                } else {
                    identical = false;
                    System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                    break;
                }
            }

        if (identical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}

