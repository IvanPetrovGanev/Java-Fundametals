import java.util.Scanner;

public class snowBalls {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int countBalls = Integer.parseInt(scanner.nextLine());
        double snowballValue = 0.0;
        double biggestValue = 0.0;
        int maxSnowballSnow = 0;
        int maxSnowballTime = 0;
        int maxSnowballQuality = 0;


        for (int i = 1; i <= countBalls ; i++) {
           int snowballSnow = Integer.parseInt(scanner.nextLine());
           int snowballTime = Integer.parseInt(scanner.nextLine());
           int snowballQuality = Integer.parseInt(scanner.nextLine());
            snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (snowballValue > biggestValue) {
                biggestValue = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;

            }
        }

        System.out.printf("%d : %d = %.0f (%d)"
        , maxSnowballSnow, maxSnowballTime, biggestValue, maxSnowballQuality);


    }
}