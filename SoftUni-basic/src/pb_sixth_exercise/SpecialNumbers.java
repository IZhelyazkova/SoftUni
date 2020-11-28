package pb_sixth_exercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int count = 0;

        for (int i = 1111; i < 9999; i++) {
            String number = String.valueOf(i);
            for (int j = 0; j < number.length(); j++) {
                int numberNum = Character.getNumericValue(number.charAt(j));
                if (numberNum == 0) {
                    break;
                } else if (n % numberNum == 0) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == 4) {
                System.out.printf("%s ", number);
                count = 0;
            } else {
                count = 0;
            }
        }

    }
}
