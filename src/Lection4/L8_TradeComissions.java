package Lection4;

import java.util.Scanner;

public class L8_TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Sity = scanner.nextLine();
        double money = Double.parseDouble(scanner.nextLine());
        double sum = 0;

        if (Sity.equalsIgnoreCase("Sofia")) {

            if (money >= 0 && money <= 500) {
                sum = money * 0.05;
            }else if (money > 500 && money <= 1000){
                sum = money * 0.07;
            }else if (money > 1000 && money <= 10000){
                sum = money * 0.08;
            }else if (money > 10000 ) sum = money * 0.12;

        } else if (Sity.equalsIgnoreCase("Varna")) {

            if (money >= 0 && money <= 500) {
                sum = money * 0.045;
            }else if (money > 500 && money <= 1000){
                sum = money * 0.075;
            }else if (money > 1000 && money <= 10000){
                sum = money * 0.1;
            }else if (money > 10000 ) sum = money * 0.13;

        } else if (Sity.equalsIgnoreCase("Plovdiv")) {

            if (money >= 0 && money <= 500) {
                sum = money * 0.055;
            }else if (money > 500 && money <= 1000){
                sum = money * 0.08;
            }else if (money > 1000 && money <= 10000){
                sum = money * 0.12;
            }else if (money > 10000 ) sum = money * 0.145;
        }else {
            System.out.println("error");
        }
        if (sum > 0 ){
            System.out.printf("%.2f", sum);
        }else {
            System.out.println("error");
        }

    }
}
