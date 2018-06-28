package Lection7;

import java.util.Scanner;

public class L2_NumbersN1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; n -= 1) {
            System.out.println(n);

        }
    }
}
