package Lection7;

import java.util.Scanner;

public class L4_EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 1;


            for (int i = 0; i <= n; i+=2) {
                System.out.println(sum);
                sum *= 4;
            }
    }
}
