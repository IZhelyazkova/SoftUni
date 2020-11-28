package pb_fifth_exercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int w = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());

        int size = w * l;

        while (size > 0) {
            String input = scan.nextLine();
            if (!input.equals("STOP")) {
                size = size - Integer.parseInt(input);
            } else {
                System.out.printf("%d pieces are left.", size);
                break;
            }
        }
        if (size < 0) {
            System.out.printf("No more cake left! You need %d pieces more.", (Math.abs(size)));
        }
    }
}
