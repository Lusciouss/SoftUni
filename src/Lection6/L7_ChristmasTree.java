package Lection6;

import java.util.Scanner;

public class L7_ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int SpaceCount = n - 1;
        int stars = n - (n - 1);

        for (int i = 0; i < n +1 ; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
        for (int i = 0; i < n; i++) {

            for (int r = 0; r < SpaceCount; r++) {
                System.out.print(" ");
            }

            for (int a = 0; a < stars; a++) {
                System.out.print("*");
            }
            System.out.print(" | ");

            for (int a = 0; a < stars; a++) {
                System.out.print("*");
            }
            SpaceCount--;
            stars++;
            System.out.println();
        }
    }
}
