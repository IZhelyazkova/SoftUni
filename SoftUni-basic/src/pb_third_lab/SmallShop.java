package pb_third_lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String city = scan.nextLine();
        BigDecimal count = new BigDecimal(scan.nextLine());

        BigDecimal coffee = new BigDecimal(0);
        BigDecimal water = new BigDecimal(0);
        BigDecimal beer = new BigDecimal(0);
        BigDecimal sweets = new BigDecimal(0);
        BigDecimal peanuts = new BigDecimal(0);
//        double water = 0;
//        double beer = 0;
//        double sweets = 0;
//        double peanuts = 0;

        switch (city) {
            case "Sofia":
                coffee = coffee.add(new BigDecimal("0.50"));
                water = water.add(new BigDecimal("0.80"));
                beer = beer.add(new BigDecimal("1.20"));
                sweets = sweets.add(new BigDecimal("1.45"));
                peanuts = peanuts.add(new BigDecimal("1.60"));
                break;
            case "Plovdiv":
                coffee = coffee.add(new BigDecimal("0.40"));
                water = water.add(new BigDecimal("0.70"));
                beer = beer.add(new BigDecimal("1.15"));
                sweets = sweets.add(new BigDecimal("1.30"));
                peanuts = peanuts.add(new BigDecimal("1.50"));
                break;
            case "Varna":
                coffee = coffee.add(new BigDecimal("0.45"));
                water = water.add(new BigDecimal("0.70"));
                beer = beer.add(new BigDecimal("1.10"));
                sweets = sweets.add(new BigDecimal("1.35"));
                peanuts = peanuts.add(new BigDecimal("1.55"));
                break;
        }
        if (product.equals("coffee")){
            BigDecimal a = coffee.multiply(count);
            System.out.println(a);
        }else if(product.equals("water")){
            BigDecimal a = water.multiply(count);
            System.out.println(a);
        }else if(product.equals("beer")){
            BigDecimal a = beer.multiply(count);
            System.out.println(a);
        }else if(product.equals("sweets")){
            BigDecimal a = sweets.multiply(count);
            System.out.println(a);
        }else{
            BigDecimal a = peanuts.multiply(count);
            System.out.println(a);
        }
    }
}
