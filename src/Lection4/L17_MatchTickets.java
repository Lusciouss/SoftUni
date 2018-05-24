package Lection4;

import java.util.Scanner;

public class L17_MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        String tikets = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double PriceTikets = 0;
        double value = 0;


        if (tikets.equalsIgnoreCase("VIP")) {
            if (people <= 4) {
                sum = money - (money * 0.75);
            } else if (people <= 9) {
                sum = money - (money * 0.6);
            } else if (people <= 24) {
                sum = money - (money * 0.5);
            } else if (people <= 49) {
                sum = money - (money * 0.4);
            } else if (people > 50) {
                sum = money - (money * 0.25);
            }
            PriceTikets = people * 499.99;


        } else if (tikets.equalsIgnoreCase("Normal")) {

            if (people <= 4) {
                sum = money - (money * 0.75);
            } else if (people <= 9) {
                sum = money - (money * 0.6);
            } else if (people <= 24) {
                sum = money - (money * 0.5);
            } else if (people <= 49) {
                sum = money - (money * 0.4);
            } else if (people > 50) {
                sum = money - (money * 0.25);
            }
            PriceTikets = people * 249.99;
        }
        if (sum > PriceTikets) {
            double num = sum - PriceTikets;
            System.out.printf("Yes! You have %.2f leva left.", num);
        } else if (sum < PriceTikets) {
            double num = PriceTikets - sum;
            System.out.printf("Not enough money! You need %.2f leva.", num);
        }
    }
}






