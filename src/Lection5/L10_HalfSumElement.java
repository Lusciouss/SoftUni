package Lection5;

import java.util.Scanner;

public class L10_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int valuebig = 0;


        for (int i = 0; i < number; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum += value;
            if (valuebig < value) {
                valuebig = value;
            }
        }
        int result = sum - valuebig;
        if (result == valuebig){
            System.out.printf("Yes Sum = %d", valuebig);
        }else {
            System.out.printf("No Diff = %d", Math.abs(valuebig - result));
        }
    }
}
