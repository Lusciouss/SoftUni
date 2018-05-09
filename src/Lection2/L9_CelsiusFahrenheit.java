package Lection2;

import java.util.Scanner;

public class L9_CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double Celsium = Double.parseDouble(scanner.nextLine());

        Double Farenhai = (Celsium * 1.8) + 32;
        System.out.printf("%.2f", Farenhai);




    }
}
