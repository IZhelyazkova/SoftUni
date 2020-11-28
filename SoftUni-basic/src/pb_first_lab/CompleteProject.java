package pb_first_lab;

import java.util.Scanner;

public class CompleteProject {
    public static void main(String[] args) {
        String name;
        int num;
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        num = Integer.parseInt(scan.nextLine());
        System.out.println("The architect " +name+" will need "+ num*3+" hours to complete "+num+" project/s.");
    }
}
