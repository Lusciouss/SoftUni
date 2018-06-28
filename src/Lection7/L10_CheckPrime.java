package Lection7;

import java.util.Scanner;

public class L10_CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        boolean isPrime = true;

        if (number <= 1 ) {
            isPrime = false;
        } else if (number == 2) {
            isPrime = true;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }
}
