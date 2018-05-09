package Lection3;

import java.util.Scanner;

public class L1_ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double Ocenka = Double.parseDouble(scanner.nextLine());
        if (Ocenka >= 5.50){
            System.out.println("Excellent!");
        }

    }
}
