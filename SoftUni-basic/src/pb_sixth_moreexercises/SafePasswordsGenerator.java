package pb_sixth_moreexercises;

import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int passwords = Integer.parseInt(scan.nextLine());
        int counter = 0;
        int i = 35;
        int j = 64;
//        boolean out = false;
        out:
//        for (int i = 35; i <= 55; ) {
//            for (int j = 64; j <= 96; ) {

        for (int k = 1; k <= a; k++) {
            for (int l = 1; l <= b; l++) {
                if (counter < passwords) {
                    System.out.printf("%s%s%d%d%s%s|", (char) i, (char) j, k, l, (char) j, (char) i);
                    counter++;
                    i++;
                    j++;
                    if (i > 55) {
                        i = 35;
                    }
                    if (j > 96) {
                        j = 64;
                    }
                }
                if (l == b && k == a) {
                    break out;
                }
//                    }

//                }

            }

        }

    }
}
