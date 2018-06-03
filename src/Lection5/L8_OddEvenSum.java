package Lection5;

import java.util.Scanner;

public class L8_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int oddsum = 0;
        int evensum = 0;

        for (int i = 1; i <= count; i++) {
            int value = Integer.parseInt(scanner.nextLine());

            if (i % 2 != 0 ){
                oddsum += value;
            }else {
                evensum += value;
            }
        }
        if (oddsum == evensum){
            System.out.printf("Yes, sum = %d", oddsum);
        }else {
            System.out.printf("No, diff = %d", Math.abs(oddsum - evensum));
        }
    }
}
