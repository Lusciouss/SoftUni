package Lection2;

import java.util.Scanner;

public class L7_RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double x1 = Double.parseDouble(scanner.nextLine());
        Double y1 = Double.parseDouble(scanner.nextLine());
        Double x2 = Double.parseDouble(scanner.nextLine());
        Double y2 = Double.parseDouble(scanner.nextLine());

        Double sideA = Math.max(x1, x2) - Math.min(x1, x2);
        Double sideB = Math.max(y1, y2) - Math.min(y1, y2);

        Double Area = sideA * sideB;
        Double Peremeter = (sideA + sideB) * 2;

        System.out.println(Area);
        System.out.println(Peremeter);

    }
}
