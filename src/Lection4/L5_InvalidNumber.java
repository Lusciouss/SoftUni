package Lection4;

import java.util.Scanner;

public class L5_InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = Integer.parseInt(scanner.nextLine());

        if (value < 100 || value > 200 ) {
            if (value != 0){
                System.out.println("invalid");
            }
        }
    }
}
