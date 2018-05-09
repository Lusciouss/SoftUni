package Lection2;

import java.util.Map;
import java.util.Scanner;

public class L10_RadiansDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double Radian = Double.parseDouble(scanner.nextLine());

        Double Degrees = Radian * 180 / Math.PI;

        System.out.println(Math.round(Degrees));


    }
}
