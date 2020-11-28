package pb_sixth_exercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = "";
        int primeSum = 0;
        int nonPrimeSum = 0;
        boolean isPrime = true;

        while (!input.equals("stop")) {
            input = scan.nextLine();
            if (input.equals("stop")) {
                break;
            } else {
                int num = Integer.parseInt(input);
                if (num < 0) {
                    System.out.println("Number is negative.");
                } else {
                    for (int i = 2; i <= num / 2; i++) {
                        int result = num % i;
                        if (result == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        primeSum = primeSum + num;
                    } else {
                        nonPrimeSum = nonPrimeSum + num;
                    }
                    isPrime = true;
                }
            }

        }
        System.out.printf("Sum of all prime numbers is: %d\nSum of all non prime numbers is: %d", primeSum, nonPrimeSum);
    }
}
