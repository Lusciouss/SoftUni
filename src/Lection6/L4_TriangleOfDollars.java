package Lection6;

import java.util.Scanner;

public class L4_TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String count = "";

        for (int i = 0; i < n; i++) {
                count += "$ ";
            System.out.println(count);
        }

    }
}
