package Lection2;

import java.util.Scanner;

public class L6_CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double r = Double.parseDouble(scanner.nextLine());
        Double area = Math.PI * r * r;
        Double perimeter = 2 * Math.PI * r;
        System.out.println(area);
        System.out.println(perimeter);
    }
}
