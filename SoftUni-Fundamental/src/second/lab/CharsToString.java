package second.lab;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String all = "";
        for (int i = 0; i < 3; i++) {
            all = all + scan.nextLine();
        }
        System.out.println(all);
    }
}
