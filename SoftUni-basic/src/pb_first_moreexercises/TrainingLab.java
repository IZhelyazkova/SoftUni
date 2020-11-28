package pb_first_moreexercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        double wM = 0;
        double hM = 0;
        Scanner scan = new Scanner(System.in);
        wM = Double.parseDouble(scan.nextLine())*100;
        hM = Double.parseDouble(scan.nextLine())*100;
        hM = hM-100;
        int desks = (int)hM/70;
        int rols = (int)wM/120;
        int total = desks*rols-3;
        System.out.println(total);
    }
}
