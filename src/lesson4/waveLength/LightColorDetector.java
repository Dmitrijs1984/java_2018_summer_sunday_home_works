package lesson4.waveLength;

import java.util.Scanner;

public class LightColorDetector {

    void detect(int waveLength) {
        if (waveLength < 380 || waveLength > 750) {
            System.out.println("Light is not visible");
        } else if (waveLength < 450) {
            System.out.println("It is purple color");
        } else if (waveLength < 495) {
            System.out.println("It is blue color");
        } else if (waveLength < 570) {
            System.out.println("It is yellow color");
        } else if (waveLength < 620) {
            System.out.println("It is orange color");
        } else if (waveLength <= 750) {
            System.out.println("It is red color");
        }

    }
}