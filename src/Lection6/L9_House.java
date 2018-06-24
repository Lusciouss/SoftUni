package Lection6;

import java.util.Scanner;

public class L9_House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int StarsCount = 1;

        if (n % 2 == 0) {
            StarsCount = 2;
        }
        for (int i = 0; i < (n + 1) / 2 ; i++) {
            int dashes = (n - StarsCount) / 2;
            String roll = repeatStr("-", dashes)
                    + repeatStr("*", StarsCount)
                    +repeatStr("-", dashes);
            System.out.println(roll);
            dashes--;
            StarsCount +=2;
        }
        for (int i = 0; i < n / 2 ; i++) {
            String slash = "|" + repeatStr("*", n-2) + "|" ;
            System.out.println(slash);
        }
    }

    static String repeatStr(String StrToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += StrToRepeat;
        }
        return text;
    }
}
