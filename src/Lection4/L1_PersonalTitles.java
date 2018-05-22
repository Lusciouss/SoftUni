package Lection4;

import java.util.Scanner;

public class L1_PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if (gender.equalsIgnoreCase("m")){
            if (Age < 16){
                System.out.println("Master");
            }else{
                System.out.println("Mr.");
            }
        }else if (gender.equalsIgnoreCase("f")){
            if (Age < 16){
                System.out.println("Miss");
            }else{
                System.out.println("Ms.");
            }
        }
    }
}
