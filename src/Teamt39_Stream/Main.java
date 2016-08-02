package Teamt39_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Sebastian on 2016-05-05.
 */
public class Main  {
    public static void main(String args[])
    {
        List<DataPoint> list = new ArrayList<>();
        for (int i = 0; i <31 ; i++) {

            list.add(new DataPoint(i,5,2016,76+new Random().nextInt(2)));
        }

list=list.stream()
        .filter(dataPoint -> dataPoint.getWartosc()==77)
        .collect(Collectors.toCollection(ArrayList::new));

        list.forEach(System.out::println);
//Tworzenie strumieni na bazie kolekcji

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers = numbers.stream()
                .filter(x -> x%2 == 0 && x>5)
                .collect(Collectors.toCollection(ArrayList::new));
        numbers.forEach(System.out::println);
//Tworzenie strumieni na podstawie sekwencji elementów

        Stream<String> strings = Stream.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff", "ggggggg");
        List<String> stringList = strings.map(String::toUpperCase)
                .peek(System.out::println)
                .collect(Collectors.toList());




        //Tworzenie strumieni na bazie generatora






        Stream<Integer> numStream = Stream.iterate(0, x -> x+1);


        //lista 100 pierwszych liczb podzielnych przez 2
        List<Integer> numbersz = numStream.filter(x -> x%2 == 0).limit(100).peek(System.out::println).collect(Collectors.toList());
//        numStream
////lista kwadratów kolejnych 100 liczb całkowitych
//        List<Integer> squareNumbers = numStream.map(x -> x*x).limit(100).collect(Collectors.toList());
////lista 100 liczb ujemnych w kolejności malejącej
//        List<Integer> negativeNumbers = numStream.map(x -> -x).limit(100).collect(Collectors.toList());

    }
}
