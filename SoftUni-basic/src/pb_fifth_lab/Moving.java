package pb_fifth_lab;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int w = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());
        int h = Integer.parseInt(scan.nextLine());
        int boxes = 0;
        int boxesCanFit = w * l * h / 1;

        String input = "";
        while (!input.equals("Done")) {
            input = scan.nextLine();
            if (!input.equals("Done")) {
                int inputN = Integer.parseInt(input);
                boxes = boxes + inputN;
                if (boxes > boxesCanFit) {
                    System.out.printf("No more free space! You need %d Cubic meters more.", (boxes - boxesCanFit));
                    break;
                }
            }
        }
        if (input.equals("Done")) {
            System.out.printf("%d Cubic meters left.", (boxesCanFit - boxes));
        }
    }
}
