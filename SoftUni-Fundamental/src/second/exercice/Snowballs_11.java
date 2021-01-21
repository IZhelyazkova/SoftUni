package second.exercice;

import java.math.BigDecimal;
import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int snowBalls = Integer.parseInt(scan.nextLine());
        BigDecimal snowBallValue = new BigDecimal("1");
        BigDecimal snowBallValueMax = new BigDecimal("0");
        int snowballSnow = 0;
        int snowballSnowMax = 0;
        int snowballTime = 0;
        int snowballTimeMax = 0;
        int snowballQuality = 0;
        int snowballQualityMax = 0;

        for (int i = 0; i < snowBalls; i++) {
            snowballSnow = Integer.parseInt(scan.nextLine());
            snowballTime = Integer.parseInt(scan.nextLine());
            snowballQuality = Integer.parseInt(scan.nextLine());
            if (snowballQuality > 1) {
                for (int j = 1; j <= snowballQuality; j++) {
                    snowBallValue = snowBallValue.multiply(new BigDecimal((double) snowballSnow / (double) snowballTime));
                }
            } else if (snowballQuality == 0) {
                snowBallValue = new BigDecimal("1");
            } else {
                snowBallValue = new BigDecimal((double) snowballSnow / (double) snowballTime);
            }
            int result = snowBallValue.compareTo(snowBallValueMax);
            if (result == 1) {
                snowBallValueMax = snowBallValue;
                snowballSnowMax = snowballSnow;
                snowballTimeMax = snowballTime;
                snowballQualityMax = snowballQuality;
            }
            snowBallValue = new BigDecimal("1");
        }
        if (snowballSnowMax == 00 && snowballTimeMax == 0) {
            snowBallValue = new BigDecimal("0");
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnowMax, snowballTimeMax, snowBallValueMax, snowballQualityMax);

    }
}
