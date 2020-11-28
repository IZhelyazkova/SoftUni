package pb_third_exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        double result = 0;
        String even = "";

        if (n2==0){
            System.out.printf("Cannot divide %d by zero",n1);
        }else {
            switch (operator){
                case "+":
                    result = n1+n2;
                    if (result%2==0){
                        even = "even";
                    }else{
                        even = "odd";
                    }
                    System.out.printf("%d %s %d = %.0f - %s",n1,operator,n2,result,even);
                    break;
                case "-":
                    result = n1-n2;
                    if (result%2==0){
                        even = "even";
                    }else{
                        even = "odd";
                    }
                    System.out.printf("%d %s %d = %.0f - %s",n1,operator,n2,result,even);
                    break;
                case "*":
                    result = n1*n2;
                    if (result%2==0){
                        even = "even";
                    }else{
                        even = "odd";
                    }
                    System.out.printf("%d %s %d = %.0f - %s",n1,operator,n2,result,even);
                    break;
                case "/":
                    result = (n1*1.0/n2*1.0);
                    System.out.printf("%d %s %d = %.2f",n1,operator,n2,result);
                    break;
                case "%":
                    result = n1%n2;
                    System.out.printf("%d %s %d = %.0f",n1,operator,n2,result);
                    break;
            }
        }
    }
}
