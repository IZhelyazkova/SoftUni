package pb_forth_moreexercises;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = Integer.parseInt(scan.nextLine());
        int fans = Integer.parseInt(scan.nextLine());

        int inA = 0;
        int inB = 0;
        int inV = 0;
        int inG = 0;
        for (int i = 0; i < fans; i++) {
            String input = scan.nextLine();
            switch (input) {
                case "A":
                    inA++;
                    break;
                case "B":
                    inB++;
                    break;
                case "V":
                    inV++;
                    break;
                case "G":
                    inG++;
                    break;
            }
        }
        System.out.printf("%.2f%%\n", (double) inA / fans * 100);
        System.out.printf("%.2f%%\n", (double) inB / fans * 100);
        System.out.printf("%.2f%%\n", (double) inV / fans * 100);
        System.out.printf("%.2f%%\n", (double) inG / fans * 100);
        System.out.printf("%.2f%%\n", (double) (inA + inB + inG + inV) / (double) max * 100);
    }
}
