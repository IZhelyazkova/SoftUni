package pb_third_exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());
        double studioPrice = 0;
        double apartmentPrice = 0;
        double discountStudio = 0;
        double discountApartment = 0;

        switch (month) {
            case "May":
            case "October":
                if (nights > 7 && nights <= 14) {
                    discountStudio = 0.05;
                } else if (nights > 14) {
                    discountStudio = 0.30;
                    discountApartment = 0.10;
                }
                studioPrice = nights * 50.0;
                studioPrice = studioPrice - (studioPrice * discountStudio);
                apartmentPrice = nights * 65;
                apartmentPrice = apartmentPrice - (apartmentPrice * discountApartment);
                break;
            case "June":
            case "September":
                if (nights > 14) {
                    discountStudio = 0.20;
                    discountApartment = 0.10;
                }
                studioPrice = nights * 75.20;
                studioPrice = studioPrice - (studioPrice * discountStudio);
                apartmentPrice = nights * 68.7;
                apartmentPrice = apartmentPrice - (apartmentPrice * discountApartment);

                break;
            case "July":
            case "August":
                if (nights > 14) {
                    discountApartment = 0.10;
                }
                studioPrice = nights * 76.0;
                apartmentPrice = nights * 77.0;
                apartmentPrice = apartmentPrice - (apartmentPrice * discountApartment);
                break;
        }
        System.out.printf("Apartment: %.2f lv.\n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
