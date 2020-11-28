package pb_second_lab;

import java.util.Scanner;

public class GuessThePassword {
    public static void main(String[] args) {
        String guess = "";
        String pass ="s3cr3t!P@ssw0rd";
        Scanner scan = new Scanner(System.in);
        guess = scan.nextLine();
        if (guess.equals(pass)){
            System.out.println("Welcome");
        }else{
            System.out.println("Wrong password!");
        }

    }
}
