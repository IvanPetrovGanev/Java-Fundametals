import java.util.Scanner;

public class sumDigits {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int digit = 0;


        while (number > 0) {

           digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        System.out.println(sum);
    }
}