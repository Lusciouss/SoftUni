package Lection5;

import java.util.Scanner;

public class L12_EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;
        int j = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < count; i++) {
            for (int a = 0; a < 2; a++) {
                int value = Integer.parseInt(scanner.nextLine());
                sum += value;
            }

            if (i == 3) {
                result4 = sum;
            } else if (i == 2) {
                result3 = sum;
            } else if (i == 1) {
                result2 = sum;
            } else if (i == 0) {
                result1 = sum;
            }
            sum = 0;
        }
        j = count;
        if (j == 4) {
            if (result1 == result2 && result3 == result4 && result2 == result3) {
                System.out.printf("Yes, value= %d", result1);
            } else {
                if (sum1 < result1) {
                    sum1 = result1;
                }
                if (sum1 < result2) {
                    sum1 = result2;
                }
                if (sum1 < result3) {
                    sum1 = result3;
                }
                if (sum1 < result4) {
                    sum1 = result4;
                }
                if (sum2 > result1) {
                    sum2 = result1;
                }
                if (sum2 > result2) {
                    sum2 = result2;
                }
                if (sum2 > result3) {
                    sum2 = result3;
                }
                if (sum2 > result4) {
                    sum2 = result4;
                }
                System.out.printf("No, maxdiff=%d", Math.abs(sum1 - sum2));
            }
        } else if (j == 3) {
            if (result1 == result2 && result2 == result3) {
                System.out.printf("Yes, value= %d", result1);
            }else {
                if (sum1 < result1) {
                    sum1 = result1;
                }
                if (sum1 < result2) {
                    sum1 = result2;
                }
                if (sum1 < result3) {
                    sum1 = result3;
                }

                if (sum2 > result1) {
                    sum2 = result1;
                }
                if (sum2 > result2) {
                    sum2 = result2;
                }
                if (sum2 > result3) {
                    sum2 = result3;
                }

                System.out.printf("No, maxdiff=%d", Math.abs(sum1 - sum2));
            }
        } else if (j == 2) {
            if (result1 == result2) {
                System.out.printf("Yes, value= %d", result1);
            }else {
                if (sum1 < result1) {
                    sum1 = result1;
                }
                if (sum1 < result2) {
                    sum1 = result2;
                }
                if (sum2 > result1) {
                    sum2 = result1;
                }
                if (sum2 > result2) {
                    sum2 = result2;
                }

                System.out.printf("No, maxdiff=%d", Math.abs(sum1 - sum2));
            }
        } else if (j == 1) {
            if (result1 != 0) {
                System.out.printf("Yes, value= %d", result1);
            }else {

            }
        }

    }
}

