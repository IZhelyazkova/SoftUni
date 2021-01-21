package second.exercice;

import java.util.Scanner;

public class PrintPartOfTheASCIITable_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());

        for (int i = start; i <= end; i++) {
            char at = (char)i;
            System.out.print(at+" ");
        }

    }
}
