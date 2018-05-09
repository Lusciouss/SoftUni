package Lection3;

import java.util.Scanner;

public class L21_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursion = Double.parseDouble(scanner.nextLine());
        int Puzzle = Integer.parseInt(scanner.nextLine());
        int Dolls = Integer.parseInt(scanner.nextLine());
        int Beers = Integer.parseInt(scanner.nextLine());
        int Minions = Integer.parseInt(scanner.nextLine());
        int Trucks = Integer.parseInt(scanner.nextLine());

        double Sum = (Puzzle * 2.6) + (Dolls * 3) + (Beers * 4.1) + (Minions * 8.2) + (Trucks * 2);
        int SumToys = Puzzle + Dolls + Beers + Minions + Trucks;

        if (SumToys >= 50){
            Sum = Sum - (Sum * 0.25);
        }
        double rent = Sum * 0.1;
        double profit = Sum - rent;

        if (profit > excursion){
            double value = profit - excursion;
            System.out.printf("Yes! %.2f lv left.", value);
        }else {
            double value = excursion - profit;
            System.out.printf("Not enough money! %.2f lv needed.", value);
        }
    }
}
