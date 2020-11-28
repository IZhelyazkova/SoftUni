package pb_first_lab;

import java.util.Scanner;

public class GreenYard {
    public static void main(String[] args) {
        double kvm;
        Scanner scan = new Scanner(System.in);
        kvm = Double.parseDouble(scan.nextLine());
        double discount = (((kvm * 7.61) / 100) * 18);
        System.out.println("The final price is: " + (kvm * 7.61 - discount) + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
