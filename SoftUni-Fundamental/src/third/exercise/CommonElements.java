package third.exercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input1 = scan.nextLine().split(" ");
        String[] input2 = scan.nextLine().split(" ");

        for (int i = 0; i < input2.length; i++) {
            for (int j = 0; j < input1.length; j++) {
                if (input2[i].equals(input1[j])) {
                    System.out.print(input2[i]+ " ");
                }
            }
        }

    }
}
