package pb_second_moreexercises;

import java.util.Scanner;

public class pipesInPool {
    public static void main(String[] args) {
        int v = 0;
        int p1 = 0;
        int p2 = 0;
        double h = 0;

        Scanner scan = new Scanner(System.in);
        v = Integer.parseInt(scan.nextLine());
        p1 = Integer.parseInt(scan.nextLine());
        p2 = Integer.parseInt(scan.nextLine());
        h = Double.parseDouble(scan.nextLine());

        double incomeP1 = p1 * h;
        double incomeP2 = p2 * h;
        double incomeTotal = incomeP1 + incomeP2;

        if (incomeTotal <= v) {
            double incomeP1percents = incomeP1 / incomeTotal * 100;
            double incomeP2percents = incomeP2 / incomeTotal * 100;
            double incomeTotalpercents = incomeTotal / v * 100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",incomeTotalpercents,incomeP1percents, incomeP2percents);
        }else{
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",h, (incomeTotal-v));
        }

    }
}
