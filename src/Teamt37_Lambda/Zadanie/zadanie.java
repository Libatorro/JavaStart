package Teamt37_Lambda.Zadanie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by Sebastian on 2016-05-05.
 */
public class zadanie {
public static void main (String args[])
{
    List<Integer> ints = new ArrayList<>();

    Random R = new Random();
    generate(ints , 50, () -> R.nextInt(500));
    System.out.println("pierwsz metoda");
  consume(ints, x -> System.out.printf(x+" "));
    System.out.println("druga metoda");
    splii_by_two_remover(ints,p ->p%2==0);

    consume(ints, x -> System.out.printf(x+" "));


}

    private static<T> void generate(List<T> list, int num, Supplier<T> sup) {
        for(int i=0; i<num; i++) {
            list.add(sup.get());
        }



    }
    private static <T> void consume(List<T> list, Consumer<T> consumer) {
        for(T t : list)
            consumer.accept(t);
    }


    private static <T> void splii_by_two_remover(List<T> list , Predicate<T> abc)
    {
        Iterator<T> it = list.iterator();
        while(it.hasNext()) {
            T tmp = it.next();
            if(abc.test(tmp)) {
                it.remove();
            }
        }



    }
}
