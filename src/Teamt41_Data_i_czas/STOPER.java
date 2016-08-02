package Teamt41_Data_i_czas;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

/**
 * Created by Sebastian on 2016-05-07.
 */
public class STOPER {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Żeby rozpocząć pomiar czasu wciśnij ENTER");
            sc.nextLine();
            Instant i1 = Instant.now();

            System.out.println("Żeby zatrzymać pomiar czasu wciśnij ENTER");
            sc.nextLine();
            Instant i2 = Instant.now();

            Duration time = Duration.between(i1, i2);
            System.out.println("Czas, który upłynął: " + time.getSeconds());


        }
    }
}