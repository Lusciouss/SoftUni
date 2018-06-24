package Lection6;

import java.util.Scanner;

public class L8_Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String FirstAndLastRoll = repeatStr("*", n * 2)
                + repeatStr(" ", n)
                + repeatStr("*", n*2);
        System.out.println(FirstAndLastRoll);

        for (int i = 0; i < n-2 ; i++) {
            String roll = "*" + repeatStr("/", n*2-2) + "*";
            if ((n-1) / 2 - 1 == i){
                roll += repeatStr("|", n);
            }else {
                 roll += repeatStr(" ", n);
            }
                   roll += "*" + repeatStr("/", n*2-2) + "*";

            System.out.println(roll);
        }

        System.out.println(FirstAndLastRoll);
    }

    static String repeatStr(String StrToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += StrToRepeat;
        }
        return text;
    }
}
