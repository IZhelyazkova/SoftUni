package pb_second_moreexercises;

import java.util.Scanner;

public class pets {
    public static void main(String[] args) {
        int days = 0;
        int foodKG = 0;
        double dogsFoodKG = 0;
        double catsFoodKG = 0;
        double turtlesFoodGR = 0;

        Scanner scan = new Scanner(System.in);

        days = Integer.parseInt(scan.nextLine());
        foodKG = Integer.parseInt(scan.nextLine());
        dogsFoodKG = Double.parseDouble(scan.nextLine());
        catsFoodKG = Double.parseDouble(scan.nextLine());
        turtlesFoodGR = Double.parseDouble(scan.nextLine());

        double turtlesFoodKg = turtlesFoodGR/1000;

        double totalFood = (double)days*(dogsFoodKG+catsFoodKG+turtlesFoodKg);

        if (totalFood<=foodKG){
            System.out.printf("%.0f kilos of food left.",Math.floor(foodKG-totalFood));
        }else{
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFood-foodKG));
        }

    }
}
