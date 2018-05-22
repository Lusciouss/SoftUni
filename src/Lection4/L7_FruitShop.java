package Lection4;

import java.util.Scanner;

public class L7_FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruits = scanner.nextLine();
        String Days = scanner.nextLine();
        double value = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if (Days.equalsIgnoreCase("Monday") ||
                Days.equalsIgnoreCase("Tuesday") ||
                Days.equalsIgnoreCase("Wednesday") ||
                Days.equalsIgnoreCase("Thursday") ||
                Days.equalsIgnoreCase("Friday")) {

            if (fruits.equalsIgnoreCase("banana")) {
                price = 2.50;
            } else if (fruits.equalsIgnoreCase("apple")) {
                price = 1.2;
            } else if (fruits.equalsIgnoreCase("orange")) {
                price = 0.85;
            } else if (fruits.equalsIgnoreCase("grapefruit")) {
                price = 1.45;
            } else if (fruits.equalsIgnoreCase("kiwi")) {
                price = 2.7;
            } else if (fruits.equalsIgnoreCase("pineapple")) {
                price = 5.5;
            } else if (fruits.equalsIgnoreCase("grapes")) {
                price = 3.85;
            }

        } else if (Days.equalsIgnoreCase("Saturday") ||
                Days.equalsIgnoreCase("Sunday")) {

            if (fruits.equalsIgnoreCase("banana")) {
                price = 2.70;
            } else if (fruits.equalsIgnoreCase("apple")) {
                price = 1.25;
            } else if (fruits.equalsIgnoreCase("orange")) {
                price = 0.90;
            } else if (fruits.equalsIgnoreCase("grapefruit")) {
                price = 1.60;
            } else if (fruits.equalsIgnoreCase("kiwi")) {
                price = 3.00;
            } else if (fruits.equalsIgnoreCase("pineapple")) {
                price = 5.6;
            } else if (fruits.equalsIgnoreCase("grapes")) {
                price = 4.20;
            }
        }
        double sum = price * value;
        if (sum > 0 ){
            System.out.printf("%.2f", sum);
        }else {
            System.out.println("error");
        }
    }
}
