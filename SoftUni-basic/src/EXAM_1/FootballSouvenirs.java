package EXAM_1;

import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String team = scan.nextLine();
        String type = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());
        double pricePer1 = 0;


        if (team.equals("Argentina") || team.equals("Brazil") || team.equals("Croatia") || team.equals("Denmark")) {

            switch (type) {
                case "flags":
                    if (team.equals("Argentina")) {
                        pricePer1 = 3.25;
                    } else if (team.equals("Brazil")) {
                        pricePer1 = 4.20;
                    } else if (team.equals("Croatia")) {
                        pricePer1 = 2.75;
                    } else {
                        pricePer1 = 3.10;
                    }
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, type, team, (count * pricePer1));
                    break;
                case "caps":
                    if (team.equals("Argentina")) {
                        pricePer1 = 7.20;
                    } else if (team.equals("Brazil")) {
                        pricePer1 = 8.50;
                    } else if (team.equals("Croatia")) {
                        pricePer1 = 6.90;
                    } else {
                        pricePer1 = 6.50;
                    }
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, type, team, (count * pricePer1));
                    break;

                case "posters":
                    if (team.equals("Argentina")) {
                        pricePer1 = 5.10;
                    } else if (team.equals("Brazil")) {
                        pricePer1 = 5.35;
                    } else if (team.equals("Croatia")) {
                        pricePer1 = 4.95;
                    } else {
                        pricePer1 = 4.80;
                    }
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, type, team, (count * pricePer1));
                    break;

                case "stickers":
                    if (team.equals("Argentina")) {
                        pricePer1 = 1.25;
                    } else if (team.equals("Brazil")) {
                        pricePer1 = 1.20;
                    } else if (team.equals("Croatia")) {
                        pricePer1 = 1.10;
                    } else {
                        pricePer1 = 0.90;
                    }
                    System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, type, team, (count * pricePer1));
                    break;
                default:
                    System.out.println("Invalid stock!");
                    break;

            }
        } else {
            System.out.println("Invalid country!");
        }

    }
}
