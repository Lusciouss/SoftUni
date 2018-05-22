package Lection4;

import java.util.Scanner;

public class L2_SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String Sity = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double sum = 0;

        if (Sity.equalsIgnoreCase("Sofia")) {

            if (product.equalsIgnoreCase("coffee")) {
                sum = 0.50;
            } else if (product.equalsIgnoreCase("water")) {
                sum = 0.80;
            } else if (product.equalsIgnoreCase("beer")) {
                sum = 1.2;
            } else if (product.equalsIgnoreCase("sweets")) {
                sum = 1.45;
            } else if (product.equalsIgnoreCase("peanuts")) {
                sum = 1.6;
            }
        } else if (Sity.equalsIgnoreCase("Plovdiv")){

            if (product.equalsIgnoreCase("coffee")) {
                sum = 0.40;
            } else if (product.equalsIgnoreCase("water")) {
                sum = 0.70;
            } else if (product.equalsIgnoreCase("beer")) {
                sum = 1.15;
            } else if (product.equalsIgnoreCase("sweets")) {
                sum = 1.30;
            } else if (product.equalsIgnoreCase("peanuts")) {
                sum = 1.5;
            }

        }else if (Sity.equalsIgnoreCase("Varna")){

            if (product.equalsIgnoreCase("coffee")) {
                sum = 0.45;
            } else if (product.equalsIgnoreCase("water")) {
                sum = 0.70;
            } else if (product.equalsIgnoreCase("beer")) {
                sum = 1.10;
            } else if (product.equalsIgnoreCase("sweets")) {
                sum = 1.35;
            } else if (product.equalsIgnoreCase("peanuts")) {
                sum = 1.55;
            }

        }
        double value = quantity * sum;
        System.out.printf("%.2f", value);
    }
}
