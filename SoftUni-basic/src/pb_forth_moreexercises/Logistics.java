package pb_forth_moreexercises;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int withBus = 0;
        int withTruck = 0;
        int withTrain = 0;
        double totalPrice = 0;

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scan.nextLine());
            if (input <= 3) {
                withBus = withBus + input;
            } else if (input <= 11) {
                withTruck = withTruck + input;
            }else{
                withTrain = withTrain+input;
            }
        }
        totalPrice = withBus*200.00+withTruck*175.00+withTrain*120.00;
        double totalTons = withBus+withTrain+withTruck;
        double roundPrice = totalPrice/totalTons;
        System.out.printf("%.2f\n",roundPrice);
        System.out.printf("%.2f%%\n",withBus/totalTons*100);
        System.out.printf("%.2f%%\n",withTruck/totalTons*100);
        System.out.printf("%.2f%%",withTrain/totalTons*100);

    }
}
