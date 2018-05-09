package Lection3;

import java.util.Scanner;

public class L20_Record {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double RecordSec = Double.parseDouble(scanner.nextLine());
        double Meters = Double.parseDouble(scanner.nextLine());
        double TimeToSec = Double.parseDouble(scanner.nextLine());

        Double swim = Meters * TimeToSec;
        double MetersAdd = Math.floor (Meters / 15) * 12.5;
        double AllTime = swim + MetersAdd;
        if (AllTime > RecordSec ){
            System.out.printf("No, he failed! He was %.2f seconds slower.", AllTime - RecordSec);
        }else if (AllTime <= RecordSec){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", AllTime);
        }

    }
}
