import java.util.Scanner;

public class pokeMon {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());

        int countPokes = 0;
        int startPower = power;

        while (power >= distance) {
            power -= distance;
            countPokes++;
            if (power == startPower / 2) {
                if (factor != 0) {
                    power /= factor;
                }
            }

        }

        System.out.println(power);
        System.out.println(countPokes);
    }
}