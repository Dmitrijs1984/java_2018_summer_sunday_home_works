package lesson4.waveLength;

import lesson4.waveLength.LightColorDetector;

import java.util.Scanner;

public class LightColorDetectorDemo {
    public static void main(String[] args) {
        System.out.println("Please enter waveLength: ");
        Scanner scanner = new Scanner(System.in);
        int userWaveLength = scanner.nextInt();

        LightColorDetector lightColorDetector = new LightColorDetector();
        lightColorDetector.detect(userWaveLength);
    }
}
