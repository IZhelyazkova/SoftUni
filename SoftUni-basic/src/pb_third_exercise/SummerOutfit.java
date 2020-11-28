package pb_third_exercise;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int degreece = Integer.parseInt(scan.nextLine());
        String time = scan.nextLine();
        String shirt = "";
        String shoes = "";

        switch (time) {
            case "Evening":
                shirt = "Shirt";
                shoes = "Moccasins";
                break;
            case "Afternoon":
                if (degreece >= 10 && degreece <= 18) {
                    shirt = "Shirt";
                    shoes = "Moccasins";
                } else if (degreece > 18 && degreece <= 24) {
                    shirt = "T-Shirt";
                    shoes = "Sandals";
                } else {
                    shirt = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Morning":
                if (degreece >= 10 && degreece <= 18) {
                    shirt = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (degreece > 18 && degreece <= 24) {
                    shirt = "Shirt";
                    shoes = "Moccasins";
                } else {
                    shirt = "T-Shirt";
                    shoes = "Sandals";
                }
                break;

        }
        System.out.printf("It's %d degrees, get your %s and %s.", degreece, shirt, shoes);
    }
}

