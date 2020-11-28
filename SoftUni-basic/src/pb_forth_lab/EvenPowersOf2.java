package pb_forth_lab;

import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int onEven = 2;
        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                System.out.println(1);
            } else if(i>1){
                onEven = onEven*2;
                if (i % 2 == 0) {
                    System.out.println(onEven);
                }
            }
        }
    }
}
