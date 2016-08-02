package Teamt39_Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Sebastian on 2016-05-05.
 */
public class Zadabue {
    public static void main(String args[])
    {

        Stream<Integer> numStream = Stream.iterate(0, x -> x+1);

        List<Integer> numbersz = numStream.filter(x-> x>100 && x <1000  && x%5==0).limit(10).map(x -> x*3).collect(Collectors.toList());
        numbersz.forEach(System.out::println);
        System.out.println();
        List<Integer> numbers = Stream.iterate(0, x -> x+1)
                .filter(x -> x>100 && x<1000 && x%5 ==0)
                .limit(10)
                .map(x -> x*3)
                .collect(Collectors.toList());
        numbers.forEach(System.out::println);
    }
}
