package pb_second_moreexercises;

import java.util.Scanner;

public class harvest {
    public static void main(String[] args) {
        int xKVM = 0;
        double yKG = 0;
        int litreNeeded = 0;
        int workers = 0;
        Scanner scan = new Scanner(System.in);
        xKVM = Integer.parseInt(scan.nextLine());
        yKG = Double.parseDouble(scan.nextLine());
        litreNeeded = Integer.parseInt(scan.nextLine());
        workers = Integer.parseInt(scan.nextLine());

        double grapeKG = xKVM*yKG;
        double grapeWine = grapeKG-(grapeKG*0.6);
        double wineLiter = (grapeWine/2.5);
        if (litreNeeded>wineLiter){
            double winemore = litreNeeded-wineLiter;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(winemore));
        }else{
            double wineleft = wineLiter-litreNeeded;
            double linePer1 = wineleft*1.0/workers*1.0;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n%.0f liters left -> %.0f liters per person.",Math.floor(wineLiter),Math.ceil(wineleft),Math.ceil(linePer1));
        }
    }
}
