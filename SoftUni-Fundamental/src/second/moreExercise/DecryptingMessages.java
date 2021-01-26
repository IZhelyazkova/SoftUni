package second.moreExercise;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int key = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        String secret = "";
        for (int i = 0; i < n; i++) {
            secret = secret + (char)((scan.nextLine().charAt(0)) + key);
        }
        System.out.println(secret);
    }
}
