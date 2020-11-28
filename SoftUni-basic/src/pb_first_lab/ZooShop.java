package pb_first_lab;

import java.util.Scanner;

public class ZooShop {
    public static void main(String[] args) {
        int dogs;
        int animals;
        Scanner scan = new Scanner(System.in);
        dogs = Integer.parseInt(scan.nextLine());
        animals = Integer.parseInt(scan.nextLine());
        System.out.println(dogs*2.50+animals*4 + " lv.");
    }
}
