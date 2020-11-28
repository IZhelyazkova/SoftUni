package pb_second_exercise;

import java.util.Scanner;

public class bonusPoints {
    public static void main(String[] args) {
        int input = 0;
        Scanner scan = new Scanner(System.in);
        input = Integer.parseInt(scan.nextLine());
        double bonus = 0;
        if (input%2 == 0){
            bonus = 1;
        }else if (input%5==0&&input%10!=0){
            bonus = 2;
        }
        if (input > 1000) {
            bonus = bonus + (input / 10.0);
        } else if (input > 100) {
            bonus = bonus + (input / 5.0);
        } else if (input <= 100) {
            bonus = bonus + 5;
        }
        System.out.printf("%.1f\n",bonus);
        System.out.printf("%.1f",(bonus+input));
    }
}
