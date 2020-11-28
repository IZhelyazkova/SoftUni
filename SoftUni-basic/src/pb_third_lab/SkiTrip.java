package pb_third_lab;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        String room = scan.nextLine();
        String grade = scan.nextLine();
        days = days-1;
        double price = 0;
        if (room.equals("room for one person")){
             price = days*18.0;
        }else if(room.equals("apartment")){
             price = days*25.0;
            if (days<10){
                price = price*0.7;
            }else if(days<15){
                price = price*0.65;
            }else{
                price = price*0.5;
            }
        }else{
             price = days*35.0;
            if (days<10){
                price = price*0.9;
            }else if(days<15){
                price = price*0.85;
            }else{
                price = price*0.8;
            }
        }
        if (grade.equals("positive")){
            price = price+(price*0.25);
        }else {
            price = price - (price*0.1);
        }
        System.out.printf("%.2f",price);
    }
}
