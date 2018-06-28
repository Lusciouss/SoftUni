package Lection7;

import java.io.PrintStream;
import java.util.Scanner;

public class L11_EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        do {

            if (number % 2 == 0){
                System.out.printf("Even number entered: %d", number);
                return;
            }else if(number % 1 == 0){
                System.out.println("The number is not even.");
                number = Integer.parseInt(scanner.nextLine());
            }else {
                System.out.println("Invalid number!");
                number = Integer.parseInt(scanner.nextLine());
            }

        }while (true);
    }
}
