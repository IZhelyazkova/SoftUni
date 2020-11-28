package pb_forth_lab;

import java.util.Scanner;

public class Numbers1ToNWithStep3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int number = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= number ;) {
            System.out.println(i);
            i=i+3;
        }
        
    }
}
