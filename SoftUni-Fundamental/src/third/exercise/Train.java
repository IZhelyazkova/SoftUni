package third.exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        String[] inWagons = new String[n];
        for (int i = 0; i < inWagons.length; i++) {
            inWagons[i] = scan.nextLine();
            sum += Integer.parseInt(inWagons[i]);
        }
        System.out.println(String.join(" ", inWagons));
        System.out.println(sum);
    }
}
