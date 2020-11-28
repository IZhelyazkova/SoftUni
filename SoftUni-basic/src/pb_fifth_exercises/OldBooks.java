package pb_fifth_exercises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String theBook = scan.nextLine();
        int books = 0;
        boolean found = false;
        String input = "";

        while (!input.equals("No More Books")) {
            input = scan.nextLine();
            if (input.equals(theBook)) {
                found = true;
                break;
            }
            if (!input.equals("No More Books")) {
                books++;
            }
        }
        if (found == true) {
            System.out.printf("You checked %d books and found it.", books);
        } else {
            System.out.printf("The book you search is not here!\nYou checked %d books.", books);
        }

    }
}
