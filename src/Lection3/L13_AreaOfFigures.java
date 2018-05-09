package Lection3;

import java.util.Scanner;

public class L13_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        Double value1 = Double.parseDouble(scanner.nextLine());
        Double value3 = null;


        if (figure.equals("square")){
            value1 = value1 * value1;
            System.out.println(value1);
        }else if (figure.equals("rectangle")){
            Double value2 = Double.parseDouble(scanner.nextLine());
            value3 = value1 * value2;
            System.out.printf("%.3f", value3);
        }else if (figure.equals("circle")){
            value3 = (value1 * value1) * Math.PI;
            System.out.printf("%.3f", value3);
        }else if (figure.equals("triangle")){
            Double value2 = Double.parseDouble(scanner.nextLine());
            value3 = (value1 * value2) /2;
            System.out.println(value3);
        }
    }
}
