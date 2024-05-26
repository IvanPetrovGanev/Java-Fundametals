import java.util.Scanner;

public class beerKegs {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int countKegs = Integer.parseInt(scanner.nextLine());
        double volume = 0.0;
        double biggestVolume = 0.0;
        String biggestKeg = "";

        for (int i = 1; i <= countKegs ; i++) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            volume = Math.PI * radius * radius * height;
            if (volume > biggestVolume) {
                biggestVolume = volume;
                biggestKeg = model;
            }
        }

        System.out.println(biggestKeg);
    }
}