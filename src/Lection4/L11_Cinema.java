package Lection4;

        import java.util.Scanner;

public class L11_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int ret = Integer.parseInt(scanner.nextLine());
        int colon = Integer.parseInt(scanner.nextLine());
        int places;
        places = 0;
        double result = 0;

        places = ret * colon;

        if (movie.equalsIgnoreCase("Premiere")) {
            result = places * 12.00;

        }else if (movie.equalsIgnoreCase("Normal")){
            result = places * 7.50;

        }else if (movie.equalsIgnoreCase("Discount")){
            result = places * 5.00;
        }
        System.out.printf("%.2f", result);
    }
}
