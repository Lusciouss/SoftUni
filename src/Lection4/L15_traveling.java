package Lection4;

import java.util.Scanner;

public class L15_traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double sum = 0;

        if (money <= 100) {

            System.out.println("Somewhere in Bulgaria");
            if (season.equalsIgnoreCase("summer")) {
                sum = money * 0.3;
                System.out.printf("Camp - %.2f", sum);
            } else if (season.equalsIgnoreCase("winter")) {
                sum = money * 0.7;
                System.out.printf("Hotel - %.2f", sum);
            }

        } else if (money <= 1000) {

            System.out.println("Somewhere in Balkans");
            if (season.equalsIgnoreCase("summer")) {
                sum = money * 0.4;
                System.out.printf("Camp - %.2f", sum);
            } else if (season.equalsIgnoreCase("winter")) {
                sum = money * 0.8;
                System.out.printf("Hotel - %.2f", sum);
            }

        } else if (money > 1000){

            System.out.println("Somewhere in Europe");
            if (season.equalsIgnoreCase("summer")) {
                sum = money * 0.9;
                System.out.printf("Hotel - %.2f", sum);
            } else if (season.equalsIgnoreCase("winter")) {
                sum = money * 0.9;
                System.out.printf("Hotel - %.2f", sum);
            }
        }
    }
}
