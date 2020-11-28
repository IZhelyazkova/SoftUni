package EXAM_1;

import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = "";
        int under17 = 0;
        int over16 = 0;

        while (!input.equals("Christmas")) {
            input = scan.nextLine();
            if (input.equals("Christmas")) {
                break;
            } else {
                int age = Integer.parseInt(input);
                if (age > 16) {
                    over16++;
                } else {
                    under17++;
                }
            }
        }
        System.out.printf("Number of adults: %d\nNumber of kids: %d\n", over16, under17);
        System.out.printf("Money for toys: %d\nMoney for sweaters: %d\n", under17 * 5, over16 * 15);
    }
}
