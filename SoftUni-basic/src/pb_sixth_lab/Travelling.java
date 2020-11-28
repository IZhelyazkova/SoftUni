package pb_sixth_lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = "";
        double moneyNeeded = 0;
        double moneyHave = 0;

        while (!destination.equals("End")) {
            destination = scan.nextLine();
            if (destination.equals("End")) {
                break;
            } else {
                moneyNeeded = Double.parseDouble(scan.nextLine());;
                while (moneyHave < moneyNeeded) {
                    moneyHave = moneyHave + Double.parseDouble(scan.nextLine());;
                }
                System.out.printf("Going to %s!\n", destination);
                moneyHave = 0;
            }
        }
    }
}
