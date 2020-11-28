package pb_second_lab;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        int grade = 0;
        Scanner scan = new Scanner(System.in);
        grade = Integer.parseInt(scan.nextLine());
        if (grade>=5){
            System.out.println("Excellent!");
        }
    }
}
