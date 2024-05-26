import java.util.Scanner;

public class waterOverflow {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int totalLiters = 0;

        for (int i = 1; i <= count ; i++) {
            int pouredLiters = Integer.parseInt(scanner.nextLine());
            totalLiters += pouredLiters;
            if (totalLiters > 255) {
                System.out.println("Insufficient capacity!");
                totalLiters -= pouredLiters;
            }

        }
        System.out.println(totalLiters);

    }
}
