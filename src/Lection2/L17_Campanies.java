package Lection2;

import java.util.Scanner;

public class L17_Campanies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Days = Integer.parseInt(scanner.nextLine());
        int Cook = Integer.parseInt(scanner.nextLine());
        int Cake = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        Double DayCake = Cake * 45.0 ;
        Double Daywaffles = waffles * 5.80 ;
        Double Daypancakes = pancakes * 3.20 ;

        Double CashForDay = (DayCake + Daywaffles + Daypancakes) * Cook ;
        Double Campanign = CashForDay * Days ;
        Double Result = Campanign - (Campanign)*0.125 ;
        System.out.printf("%.2f", Result);

    }
}
