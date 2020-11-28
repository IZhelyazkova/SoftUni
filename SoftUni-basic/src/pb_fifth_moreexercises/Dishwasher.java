package pb_fifth_moreexercises;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bottles = Integer.parseInt(scan.nextLine());
        int ml = bottles * 750;
        int mlUsed = 0;

        boolean wash = true;
        int rounds = 0;
        int dishes = 0;
        int pots = 0;

        while (wash) {
            String input = scan.nextLine();
            rounds++;
            if (input.equals("End")) {
                break;
            } else {
                int toWash = Integer.parseInt(input);
                if (rounds % 3 == 0) {
                    mlUsed = mlUsed + toWash * 15;
                    pots = pots + toWash;
                } else {
                    dishes = dishes + toWash;
                    mlUsed = mlUsed + toWash * 5;
                }
            }
            if (mlUsed > ml) {
                break;
            }
        }
        if (ml >= mlUsed) {
            System.out.printf("Detergent was enough!\n%d dishes and %d pots were washed.\nLeftover detergent %d ml.", dishes, pots, (ml - mlUsed));
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", (mlUsed - ml));
        }
    }
}
