package Teamt38_Referencje_do_Metod;

/**
 * Created by Sebastian on 2016-05-05.
 */
import Teamt26_Zapis_Odczyt_plikow.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class PersonsGenerator {
    public static void main(String[] args) {
        List<Person> persons = generate(10, Person::new);
    }

    private static <T> List<T> generate(int num, Supplier<T> sup) {
        List<T> result = new ArrayList<T>();
        for(int i=0; i<num; i++) {
            result.add(sup.get());
        }
        return result;
    }


}