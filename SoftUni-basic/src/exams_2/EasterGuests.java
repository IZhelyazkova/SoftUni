package exams_2;

import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int guests = 0;
        int budget = 0;

        guests = Integer.parseInt(scan.nextLine());
        budget = Integer.parseInt(scan.nextLine());

        double kozunak = Math.ceil(guests / 3.0);
        double eggs = guests * 2;

        double totalPrice = kozunak * 4.0 + eggs * 0.45;

        if (totalPrice <= budget) {
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.\n", kozunak, eggs);
            System.out.printf("He has %.2f lv. left.", budget - totalPrice);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", totalPrice - budget);
        }
    }
}
