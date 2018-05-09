package Lection2;

import java.util.Scanner;

public class L4_NameAndAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.nextLine();
        String lastname = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sity = scanner.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s."
                , firstname, lastname, age, sity);

    }
}
