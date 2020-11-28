package EXAM_1;

import java.util.Scanner;

public class Moon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double speed = Double.parseDouble(scan.nextLine());
        double littresPer100km = Double.parseDouble(scan.nextLine());


        double totalKM = 2 * 384400;
        double time = totalKM / speed;

        time = time + 3;
        double fuel = littresPer100km * totalKM / 100.00;
        System.out.println((int)Math.ceil(time));
        System.out.println((int)fuel);

    }
}
