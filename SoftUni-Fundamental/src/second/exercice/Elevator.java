package second.exercice;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());

        int sum = people / capacity ;
        if (people%capacity>0){
            sum++;
        }

        System.out.println(sum);

    }
}
