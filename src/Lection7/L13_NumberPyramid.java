package Lection7;

import java.util.Scanner;

public class L13_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 1;

        for (int i = 1; ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(counter + " ");
                counter++;

                if (counter > n ){
                    break;
                }

            }
            System.out.println();
            if (counter > n){
                break;
            }

        }
    }
}
