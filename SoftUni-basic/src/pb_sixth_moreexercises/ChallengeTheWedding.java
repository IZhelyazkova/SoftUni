package pb_sixth_moreexercises;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int man = Integer.parseInt(scan.nextLine());
        int woman = Integer.parseInt(scan.nextLine());
        int tables = Integer.parseInt(scan.nextLine());
        int counter = 0;

            for (int i = 1; i <= man; i++) {
                for (int j = 1; j <= woman; j++) {
                    if (counter < tables) {
                        counter++;
                        System.out.printf("(%d <-> %d) ", i, j);

                }
            }
        }
    }
}
