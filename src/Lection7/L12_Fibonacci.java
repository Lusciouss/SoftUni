package Lection7;

import java.util.Scanner;

public class L12_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int fib0 = 1;
        int fib1 = 1;

        while (n > 1){
            int sum = fib0 + fib1;
            fib0 = fib1;
            fib1 = sum;
            n--;
        }
        System.out.println(fib1);

    }
}
