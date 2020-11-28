package pb_fifth_lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String password = scan.nextLine();
        String passWord = scan.nextLine();
        while (!password.equals(passWord)) {
            passWord = scan.nextLine();
        }
        System.out.printf("Welcome %s!", username);
    }
}
