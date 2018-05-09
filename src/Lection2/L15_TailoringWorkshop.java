package Lection2;

import java.util.Scanner;

public class L15_TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int table = Integer.parseInt(scanner.nextLine());
        Double daljina = Double.parseDouble(scanner.nextLine());
        Double shirina = Double.parseDouble(scanner.nextLine());

        Double pokrivki = table * (daljina + 2 * 0.30) * (shirina + 2 * 0.30);
        Double kareta = table * (daljina /2 ) * (daljina / 2);

        Double USD = (pokrivki * 7) + (kareta * 9);
        Double BGN = USD * 1.85 ;



        System.out.printf("%.2f", USD);
        System.out.println(" USD");
        System.out.printf("%.2f", BGN);
        System.out.println(" BGN");

    }
}
