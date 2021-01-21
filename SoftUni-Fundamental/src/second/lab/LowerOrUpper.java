package second.lab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        if (input.equals(input.toLowerCase())){
            System.out.println("lower-case");
        }else{
            System.out.println("upper-case");
        }
    }
}
