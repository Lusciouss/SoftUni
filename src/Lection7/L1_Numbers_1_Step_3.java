package Lection7;

import java.util.Scanner;

public class L1_Numbers_1_Step_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 1;

        for (int i = 0; i < n; i += 3) {
            System.out.println(sum);
            sum += 3;
        }
    }
}
