package pb_first_lab;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        String name = "";
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        System.out.println("Hello, "+ name + "!" );
    }
}
