package Lection4;

import java.util.Scanner;

public class L4_FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();

        if (value.equalsIgnoreCase("banana") ||
                value.equalsIgnoreCase("apple") ||
                value.equalsIgnoreCase("kiwi") ||
                value.equalsIgnoreCase("cherry") ||
                value.equalsIgnoreCase("lemon") ||
                value.equalsIgnoreCase("grapes")){
            System.out.println("fruit");
        }else if (value.equalsIgnoreCase("tomato") ||
                value.equalsIgnoreCase("cucumber") ||
                value.equalsIgnoreCase("pepper") ||
                value.equalsIgnoreCase("carrot")){
            System.out.println("vegetable");
        }else{
            System.out.println("unknown");
        }
    }
}
