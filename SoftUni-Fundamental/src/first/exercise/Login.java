package first.exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String password = reverse(username);

        String input = scan.nextLine();
        int count = 0;

        while (count < 4) {
            if (input.equals(password)) {
                System.out.printf("User %s logged in.%n", username);
                break;
            } else {
                count++;
                if (count < 4) {
                    System.out.println("Incorrect password. Try again.");
                    input = scan.nextLine();
                }
            }
        }
        if (count >= 4) {
            System.out.printf("User %s blocked!", username);
        }
    }

    public static String reverse(String input) {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        return output;
    }
}
