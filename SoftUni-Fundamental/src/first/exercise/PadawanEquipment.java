package first.exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyHave = Double.parseDouble(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());
        double lightsaberPrice = Double.parseDouble(scan.nextLine());
        double robePrice = Double.parseDouble(scan.nextLine());
        double beltPrice = Double.parseDouble(scan.nextLine());

        double ligjtsabersCount = (Math.ceil(students * 1.1));
        double belts = 0;
        double robes = students;
        if (students / 6 >= 1) {
            belts = students - (int) (Math.floor(students / 6));
        }else{
            belts = students;
        }

        double moneyNeeed = robes * robePrice + beltPrice * belts + lightsaberPrice * ligjtsabersCount;
        if (moneyHave >= moneyNeeed) {
            System.out.printf("The money is enough - it would cost %.2flv.", moneyNeeed);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", (moneyNeeed - moneyHave));
        }

    }
}
