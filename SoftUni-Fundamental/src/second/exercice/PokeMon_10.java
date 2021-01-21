package second.exercice;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int energy = Integer.parseInt(scan.nextLine());
        int startEnergyHalf = energy / 2;
        int distance = Integer.parseInt(scan.nextLine());
        int exhaustionFactor = Integer.parseInt(scan.nextLine());

        int poked = 0;
        while (energy >= distance) {
            energy -= distance;
            poked++;
            if (energy == startEnergyHalf && exhaustionFactor != 0) {
                energy = energy / exhaustionFactor;
            }
        }
        System.out.printf("%d%n%d", energy, poked);
    }
}
