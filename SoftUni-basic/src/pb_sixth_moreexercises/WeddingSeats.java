package pb_sixth_moreexercises;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        Scanner scan2 = new Scanner(System.in);
//
//        char lastRow = scan2.next().charAt(0);
        String lastRowSTR = scan.nextLine();
        int rowsINFirst = Integer.parseInt(scan.nextLine());
        int placesOdd = Integer.parseInt(scan.nextLine());
        char lastRow = lastRowSTR.charAt(0);
        int counter = 0;
        int rowsToAdd = 0;
        int placesEven = placesOdd + 2;
        int total = 0;

        for (int i = (int) 'A'; i <= (int) lastRow; i++) {
            int placesAtRow = 0;

            for (int j = 1; j <= rowsINFirst + rowsToAdd; j++) {
                counter++;
                if (counter % 2 == 0) {
                    placesAtRow = placesEven;
                } else {
                    placesAtRow = placesOdd;
                }
                for (int k = 97; k < 97 + placesAtRow; k++) {
                    System.out.printf("%s%d%s\n", (char) i, j, (char) k);
                    total++;
                }
            }
            rowsToAdd++;
            counter = 0;
        }
        System.out.println(total);
    }
}
