package Lection7;

import java.util.Scanner;

public class L5_Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 1;

        for (int i = 0; sum <= n; i++) {
            System.out.println(sum);

            if ( n >= sum){
                sum = sum * 2 + 1 ;
            }
        }

    }
}
