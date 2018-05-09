package Lection3;

import java.util.Scanner;

public class L6_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double BonusPoint = 0;
        if (num <= 100) {
            BonusPoint = 5;
        }else if (num < 1000 ){
            BonusPoint = num * 0.2;
        }else if (num > 1000){
            BonusPoint = 0.1 * num;
        }

        if (num % 2 == 0){
            BonusPoint = BonusPoint +1;
        }else if (num % 10 == 5){
            BonusPoint = BonusPoint +2;
        }
        System.out.println("Bonus Score: " + BonusPoint);
        System.out.println("Total Score: " + (num + BonusPoint));
    }
}
