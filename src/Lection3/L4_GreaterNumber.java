package Lection3;

import java.util.Scanner;

public class L4_GreaterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double number = Double.parseDouble(scan.nextLine());
        Double number1 = Double.parseDouble(scan.nextLine());

        if (number > number1){
            System.out.println(number);
        }else {
            System.out.println(number1);
        }

    }
}
