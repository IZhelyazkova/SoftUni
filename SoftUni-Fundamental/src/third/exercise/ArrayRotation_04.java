package third.exercise;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int n = Integer.parseInt(scan.nextLine());
        for (int j = 0; j < n; j++) {
            String keep = input[0];
            for (int i = 0; i < input.length - 1; i++) {
                input[i] = input[i + 1];
            }
            input[input.length - 1] = keep;
        }
        System.out.println(String.join(" ", input));
    }
}
