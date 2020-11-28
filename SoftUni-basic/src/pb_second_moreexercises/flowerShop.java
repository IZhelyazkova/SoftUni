package pb_second_moreexercises;

import java.util.Scanner;

public class flowerShop {
    public static void main(String[] args) {
        int magnolii = 0;
        int ziumbiuli = 0;
        int roses = 0;
        int cactus = 0;
        double giftPrice = 0;

        Scanner scan = new Scanner(System.in);

        magnolii = Integer.parseInt(scan.nextLine());
        ziumbiuli = Integer.parseInt(scan.nextLine());
        roses = Integer.parseInt(scan.nextLine());
        cactus = Integer.parseInt(scan.nextLine());
        giftPrice = Double.parseDouble(scan.nextLine());

        double income = (magnolii*3.25+ziumbiuli*4.0+roses*3.5+cactus*8.0)*0.95;
        if (income>=giftPrice){
            System.out.printf("She is left with %.0f leva.",Math.floor(income-giftPrice));
        }else
        {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice-income));
        }
    }
}
