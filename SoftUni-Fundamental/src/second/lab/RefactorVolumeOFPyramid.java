package second.lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class RefactorVolumeOFPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Length: ");
        BigDecimal lenght = new BigDecimal(scan.nextLine());
        System.out.print("Width: ");
        BigDecimal width = new BigDecimal(scan.nextLine());
        System.out.print("Height: ");
        BigDecimal height = new BigDecimal(scan.nextLine());
//        long v = lenght+width+height;
        BigDecimal v = new BigDecimal("0");
        v = v.add(lenght);
        v = v.add(width);
        v = v.add(height);
//        v = v.divide(new BigDecimal(3));
        System.out.printf("Pyramid Volume: %.2f", v);

//        double dul, sh, V = 0;
//        System.out.print("Length: ");
//        dul = Double.parseDouble(scan.nextLine());
//        System.out.print("Width: ");
//        sh = Double.parseDouble(scan.nextLine());
//        System.out.print("Height: ");
//        V = Double.parseDouble(scan.nextLine());
//        V = (dul + sh + V) ;
//        System.out.printf("Pyramid Volume: %.2f", V);


    }
}
