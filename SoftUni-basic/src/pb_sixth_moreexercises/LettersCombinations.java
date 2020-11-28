package pb_sixth_moreexercises;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char begining = scan.next().charAt(0);
        char end = scan.next().charAt(0);
        char pass = scan.next().charAt(0);


        int counter = 0;

        for (int i = (int) begining; i <= (int) end; i++) {
            for (int j = (int) begining; j <= (int) end; j++) {
                for (int k = (int) begining; k <= (int) end; k++) {
                    if (i != pass && j != pass && k != pass) {
                        counter++;
                        System.out.printf("%s%s%s ", (char) i, (char) j, (char) k);
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
