package Lection5;

import java.util.Scanner;

public class L6_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = Integer.parseInt(scanner.nextLine());
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < value; i++) {
            int sum = Integer.parseInt(scanner.nextLine());
            if (result > sum) {
                result = sum;
            }
        }
        System.out.println(result);
    }
}
