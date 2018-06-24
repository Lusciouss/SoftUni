package Lection6;

import java.util.Scanner;

public class L10_Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int StarsCount = 1;

        if (n % 2 == 0) {
            StarsCount = 2;
        }
        for (int i = 0; i < (n + 1) / 2; i++) {
            int dashes = n - StarsCount;
            String roll = repeatStr("-", dashes / 2);
            if (StarsCount > 2) {
                int value = StarsCount - 2;
                String rollStars = "*" + repeatStr("-", value) + "*";
                System.out.print(roll);
                System.out.print(rollStars);
            } else {
                roll += repeatStr("*", StarsCount);
                roll += repeatStr("-", dashes / 2);
            }


            System.out.println(roll);
            dashes--;
            StarsCount += 2;
        }
        for (int i = 1; i <= n / 2; i++) {
           int value = 0;
           value = n -2;
            for (int j = 0; j < i; j++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = 0; j < value - 2; j++) {
                System.out.print("-");
            }
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print("-");
            }



           /* String RollStars = repeatStr("-", i )
                    + "*"
                    + repeatStr("-", value - 2)
                    + "*"
                    + repeatStr("-", i ); */
            //System.out.println(RollStars);
            System.out.println();
            //value -= 2;


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
