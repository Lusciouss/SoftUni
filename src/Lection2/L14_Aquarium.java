package Lection2;

import java.util.Scanner;

public class L14_Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daljina = Integer.parseInt(scanner.nextLine());
        int shirina = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        Double procent  = Double.parseDouble(scanner.nextLine());

        int AreaAquarium = daljina * shirina * h;
        Double LitersAquarium = AreaAquarium * 0.001;
        Double procentAquarium = procent * 0.01;
        Double LitersAqua = LitersAquarium * (1 - procentAquarium);

        System.out.printf("%.3f", LitersAqua);





    }
}
