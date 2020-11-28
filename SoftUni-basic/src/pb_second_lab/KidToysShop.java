package pb_second_lab;

import java.util.Scanner;

public class KidToysShop {
    public static void main(String[] args) {
        double travelPrice = 0;
        int puzzles = 0;
        int doll = 0;
        int bears = 0;
        int minions = 0;
        int trucks = 0;
        Scanner scan = new Scanner(System.in);
        travelPrice = Double.parseDouble(scan.nextLine());
        puzzles = Integer.parseInt(scan.nextLine());
        doll = Integer.parseInt(scan.nextLine());
        bears = Integer.parseInt(scan.nextLine());
        minions = Integer.parseInt(scan.nextLine());
        trucks = Integer.parseInt(scan.nextLine());
        int total = puzzles+doll+bears+minions+trucks;
        double price = puzzles*2.60+doll*3+bears*4.10+minions*8.20+trucks*2;
        if (total>=50){
            price = price - (price/4);
        }
        price = price - (price/10);
        if (price>=travelPrice){
            System.out.printf("Yes! %.2f lv left.",(price-travelPrice));
        }else{
            System.out.printf("Not enough money! "+"%.2f"+" lv needed.", (travelPrice-price));
        }

    }
}
