package Teamt40_Przetwarzanie_kolekcji;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Sebastian on 2016-05-05.
 */

public class MultiThread {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //  JEDNO WATKOWO
        // ints = ints.stream().map(MultiThread::incrementValue).collect(Collectors.toList());
// WIELO WATKOWO
        // Alternatywą jest wywołanie na kolekcji metody parallelStream() zamiast samego stream(). Zauważ jedną ważną rzecz, że przetwarzanie danych w ten
        // sposób nie gwarantuje nam kolejności przetwarzania obiektów - w uproszczeniu obliczenia wykonywane są losowo (co na szczęście najczęściej nie jest problemem).
        ints = ints.stream().parallel().map(MultiThread::incrementValue)
                .collect(Collectors.toList());




    }

    public static int incrementValue(int x) {
        try {
           Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Przetwarzam " + x);
        return x+1;
    }
}