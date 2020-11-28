package EXAM_1;

import java.util.Scanner;

public class ANDProcessors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int processors = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        int totalHours = days*8*workers;
        double totalProcessors = Math.floor(totalHours/3);
        if (totalProcessors>=processors){
            System.out.printf("Profit: -> %.2f BGN",((totalProcessors-processors)*110.10));
        }else{
            System.out.printf("Losses: -> %.2f BGN",((processors-totalProcessors)*110.10));
        }

    }
}
