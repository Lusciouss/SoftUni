package Lection2;

import java.util.Scanner;

public class L18_AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double PriceWhiskey = Double.parseDouble(scanner.nextLine());
        Double Beer = Double.parseDouble(scanner.nextLine());
        Double Wine = Double.parseDouble(scanner.nextLine());
        Double Rakia = Double.parseDouble(scanner.nextLine());
        Double Whiskey = Double.parseDouble(scanner.nextLine());

        Double PriceRakia = PriceWhiskey - (0.5 * PriceWhiskey);
        Double PriceWine =  PriceRakia - (0.4 * PriceRakia);
        Double PriceBeer = PriceRakia - (0.8 * PriceRakia);

        Double SumRakia = PriceRakia * Rakia;
        Double SumWine = PriceWine * Wine;
        Double SumBeer = PriceBeer * Beer;
        Double SumWhiskey = PriceWhiskey * Whiskey;

        Double Result = SumRakia + SumWine + SumBeer + SumWhiskey;
        System.out.printf("%.2f", Result);

//
    }
}
