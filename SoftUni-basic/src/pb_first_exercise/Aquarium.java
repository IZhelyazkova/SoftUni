package pb_first_exercise;

import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        int length = 0;
        int width = 0;
        int high = 0;
        double taken = 0;

        Scanner scan = new Scanner(System.in);

        length = Integer.parseInt(scan.nextLine());
        width = Integer.parseInt(scan.nextLine());
        high = Integer.parseInt(scan.nextLine());
        taken = Double.parseDouble(scan.nextLine());

        double sm3 = length*width*high;
        double d3 = sm3/1000.0;

        double takenL = (d3*taken/100.0);
        System.out.printf("%.2f",d3 - takenL);
    }
}
