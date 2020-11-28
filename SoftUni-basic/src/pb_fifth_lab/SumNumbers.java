package pb_fifth_lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        while (sum<n){
            sum = sum + Integer.parseInt(scan.nextLine());
        }
        System.out.println(sum);
    }
}
