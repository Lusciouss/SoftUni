package Lection5;

import java.util.Scanner;

public class L7_LeftRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int leftsum = 0;
        int rightsum =0;

        for (int i = 0; i < count; i++){
            int value = Integer.parseInt(scanner.nextLine());
            leftsum += value;
        }
        for (int i = 0; i < count; i++){
            int value = Integer.parseInt(scanner.nextLine());
            rightsum += value;
        }
        if (leftsum == rightsum){
            System.out.printf("Yes, sum = %d", leftsum);
        }else {
            System.out.printf("No, diff = %d", Math.abs(leftsum - rightsum));
        }
    }
}
