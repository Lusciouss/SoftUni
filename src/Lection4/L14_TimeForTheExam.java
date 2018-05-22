package Lection4;

import java.util.Scanner;

public class L14_TimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int HourExam = Integer.parseInt(scanner.nextLine());
        int MinuteExam = Integer.parseInt(scanner.nextLine());
        int HourOfArrival = Integer.parseInt(scanner.nextLine());
        int MinuteOfArrival = Integer.parseInt(scanner.nextLine());

        if (HourExam < HourOfArrival || MinuteExam < MinuteOfArrival) {
            System.out.println("Late");

        } else if (HourExam == HourOfArrival  ){

        }
    }
}
