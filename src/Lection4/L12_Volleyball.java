package Lection4;

import java.io.PrintStream;
import java.util.Scanner;

public class L12_Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Year = scanner.nextLine();
        double HolidaysYear = Double.parseDouble(scanner.nextLine());
        double hometown = Double.parseDouble(scanner.nextLine());

        double WeekendSofia = 48 - hometown;
        double PlayInSofia = WeekendSofia * (3.0 / 4);
        double PlayInHome = hometown;
        double PlayInHolidays = HolidaysYear * (2.0 / 3);
        double SumPlay = PlayInHolidays + PlayInHome + PlayInSofia;

        if (Year.equalsIgnoreCase("leap")) {
            double Sum = (SumPlay + (SumPlay * 0.15));
            System.out.println((int)(Sum));
        }else {
            System.out.println((int)(SumPlay));
        }
    }
}
