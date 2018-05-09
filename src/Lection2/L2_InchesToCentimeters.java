package Lection2;

import java.util.Scanner;

public class L2_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double inch = scanner.nextDouble();
        Double sum = inch * 2.54;
        System.out.println(sum);

    }
}
