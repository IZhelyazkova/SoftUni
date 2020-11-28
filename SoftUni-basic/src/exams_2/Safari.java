package exams_2;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = 0;
        double fuel = 0;
        String weekDay = "";

        budget = Double.parseDouble(scan.nextLine());
        fuel = Double.parseDouble(scan.nextLine());
        weekDay = scan.nextLine();

        double fuelTotal = fuel*2.10;
        double totalPrice = 100+fuelTotal;
        if (weekDay.equals("Saturday")){
            totalPrice = totalPrice*0.9;
        }else{
            totalPrice = totalPrice*0.8;
        }
            if (totalPrice<=budget){
                System.out.printf("Safari time! Money left: %.2f lv.",budget-totalPrice);
            }else{
                System.out.printf("Not enough money! Money needed: %.2f lv.",totalPrice-budget);
            }

    }
}
