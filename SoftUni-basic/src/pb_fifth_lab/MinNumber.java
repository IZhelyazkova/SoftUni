package pb_fifth_lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int min = Integer.MAX_VALUE;

        while (!input.equals("Stop")){
            int n = Integer.parseInt(input);
            if (n<min){
                min = n;
            }
            input = scan.nextLine();
        }
        System.out.println(min);
    }
}
