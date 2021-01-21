package second.exercice;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String model = "";
        String type = "";
        double volume = 0;
        double volMax = 0;

        for (int i = 0; i < n; i++) {
            type = scan.nextLine();
            double radious = Double.parseDouble(scan.nextLine());
            volume = Math.PI * radious * radious * Double.parseDouble(scan.nextLine());
            if (volume > volMax) {
                model = type;
                volMax = volume;
            }
        }


        System.out.println(model);
    }
}
