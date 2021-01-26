package second.moreExercise;

import java.util.Scanner;

public class BalancedBrackets_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        boolean opening = false;
        boolean closing = false;
        String input = "";
        boolean balanced = false;
        for (int i = 0; i < n; i++) {
            input = scan.nextLine();
            if (input.equals("(") && !opening) {
                opening = true;
                balanced = false;
            } else if (input.equals("(")&&opening) {
                balanced = false;
                break;
            } else if (input.equals(")") && !closing && opening) {
                balanced = true;
                opening = false;
            } else if (input.equals(")") && !opening) {
                balanced = false;
                break;
            }
        }
        if (balanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");

        }
    }
}
