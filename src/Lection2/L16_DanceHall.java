package Lection2;

import java.util.Scanner;

import static java.lang.Math.*;

public class L16_DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double L = Double.parseDouble(scanner.nextLine());
        Double W = Double.parseDouble(scanner.nextLine());
        Double A = Double.parseDouble(scanner.nextLine());

        Double Hall = (L * 100) * (W * 100);
        Double AA = A * 100;
        Double Garderob = AA * AA;
        Double Peika = Hall / 10;
        Double FreeSpace = Hall - Garderob - Peika;
        Double Dancers = FreeSpace / (40+7000);

        System.out.printf("%.0f", Dancers);
    }
}
