package Lection5;

import java.util.Scanner;

public class L13_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;


        for (int i = 0; i < value; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());

            if (numbers < 200) {
                ++p1;
            } else if (numbers <= 399) {
                ++p2;
            } else if (numbers <= 599) {
                ++p3;
            } else if (numbers <= 799) {
                ++p4;
            } else if (numbers >= 800) {
                ++p5;
            }
        }
        double result1 = (100.0 / value) * p1;
        System.out.printf("%.2f%% %n", result1);
        double result2 = (100.0 / value) * p2;
        System.out.printf("%.2f%% %n", result2);
        double result3 = (100.0 / value) * p3;
        System.out.printf("%.2f%% %n", result3);
        double result4 = (100.0 / value) * p4;
        System.out.printf("%.2f%% %n", result4);
        double result5 = (100.0 / value) * p5;
        System.out.printf("%.2f%% %n", result5);
    }
}
