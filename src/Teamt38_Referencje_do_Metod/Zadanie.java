package Teamt38_Referencje_do_Metod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Sebastian on 2016-05-05.
 */
public class Zadanie {

    List<String> Lista_imion= new ArrayList<>();

    public static void main(String args[])
    {
        List<String> Lista_imion= new ArrayList<>();
        Lista_imion.add("Janusz");
        Lista_imion.add("Pablo");
        Lista_imion.add("grażyna    ");
        Lista_imion.add("tadeusz");
        Lista_imion.add("Zbigniew");
        Lista_imion.add("Trampolin");


        consumeList(Lista_imion, p -> System.out.println(p));
        System.out.println("    ");

Collections.sort(Lista_imion,String::compareToIgnoreCase);
        Collections.sort(Lista_imion,Zadanie::sortAscending);
        consumeList(Lista_imion, System.out::println);


    }
    private static int sortAscending(String t1, String t2) {
        return t1.compareTo(t2);
    }

    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }




}




