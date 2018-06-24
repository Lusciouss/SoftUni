package Lection6;

import java.util.Scanner;

public class L6_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = n-1;
        int value = n- (n - 1);
        int val = n-2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            count--;
            System.out.println();
        }

        for (int i = 0; i < n-1; i++) {

            for (int j = 0; j < value; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < val; j++) {
                System.out.print(" *");
            }
            value++;
            val--;
            System.out.println();
        }


    }
}
