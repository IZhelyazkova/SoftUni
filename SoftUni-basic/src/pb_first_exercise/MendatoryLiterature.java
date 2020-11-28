package pb_first_exercise;

import java.util.Scanner;

public class MendatoryLiterature {
    public static void main(String[] args) {
        int pagesinBook = 0;
        int pagesPerH = 0;
        int days = 0;
        Scanner scan = new Scanner(System.in);
        pagesinBook = Integer.parseInt(scan.nextLine());
        pagesPerH = Integer.parseInt(scan.nextLine());
        days = Integer.parseInt(scan.nextLine());
        System.out.println(pagesinBook/pagesPerH/days);
    }
}
