package Lection3;

import java.util.Scanner;

public class L7_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = Integer.parseInt(scanner.nextLine());
        int time1 = Integer.parseInt(scanner.nextLine());
        int time2 = Integer.parseInt(scanner.nextLine());

        int sum = time + time1 + time2;

        if (sum <= 59){

            if (sum < 10){
                System.out.println("0:0" + sum);
            }else {
                System.out.println("0:" + (sum));
            }
        }else if(sum <= 119){
           int value = sum - 60;
           if (value < 10){
               System.out.println("1:0" + value);
           }else {
               System.out.println("1:" + (value));
           }
        }else if (sum <= 179){
            int value = sum - 120;
            if (value < 10){
                System.out.println("2:0" + value);
            }else {
                System.out.println("2:" + (value));
            }
        }

    }
}
