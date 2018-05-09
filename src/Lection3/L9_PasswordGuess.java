package Lection3;

import java.util.Scanner;

public class L9_PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String password1 = "s3cr3t!P@ssw0rd" ;
        if (password1.equals(password)){
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong password!");
        }
    }
}
