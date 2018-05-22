package Lection4;

import java.util.Scanner;

public class L3_PointInRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        boolean left = x1 <= x && y1 <= y;
        boolean right = x2 >= x && y2 >= y;
        boolean up = x1 <= x && y1 <= y;
        boolean down = x2 >= x && y2 >= y;

        if (left || right || up || down) {
            System.out.println("Inside");
        }else{
            System.out.println("Outside");
        }

    }
}
