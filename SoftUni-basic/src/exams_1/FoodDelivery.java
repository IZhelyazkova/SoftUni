package exams_1;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        int chickenMenu = 0;
        int fishMenu = 0;
        int veggyMenu = 0;

        Scanner scan = new Scanner(System.in);

        chickenMenu = Integer.parseInt(scan.nextLine());
        fishMenu = Integer.parseInt(scan.nextLine());
        veggyMenu = Integer.parseInt(scan.nextLine());

        double chikenP = chickenMenu*10.35;
        double fishP = fishMenu*12.40;
        double veggyP = veggyMenu*8.15;
        double dessertP =(chikenP+fishP+veggyP)*0.2;

        System.out.printf("Total: %.2f",(dessertP+chikenP+fishP+veggyP+2.50));
    }
}
