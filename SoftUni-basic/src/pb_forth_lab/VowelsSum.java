package pb_forth_lab;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)=='a'){
                sum +=1;
            }else if(input.charAt(i)=='e'){
                sum +=2;
            }else if(input.charAt(i)=='i'){
                sum +=3;
            }else if(input.charAt(i)=='o'){
                sum +=4;
            }else if(input.charAt(i)=='u'){
                sum +=5;
            }
        }
        System.out.println(sum);
    }
}
