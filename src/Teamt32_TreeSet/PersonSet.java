package Teamt32_TreeSet;

/**
 * Created by Sebastian on 2016-04-27.
 */
import java.util.HashSet;

public class PersonSet {
    public static void main(String[] args) {
        HashSet<Person> persons = new HashSet<>();

        persons.add(new Person("Jan", "Kowalski"));
        persons.add(new Person("Jan", "Kowalski"));
        persons.add(new Person("Ania", "Kawalec"));
        persons.add(new Person("Ania", "Kawalec"));
        persons.add(new Person("Szymon", "Zalewski"));
        persons.add(new Person("Jan", "Kowalski"));
        persons.add(new Person("Ania", "Kawalec"));
        persons.add(new Person("Ania", "Kawalec"));
        persons.add(new Person("Szymon", "Zalewski"));
        persons.add(new Person("Jan", "Kowalski"));
        persons.add(new Person("Ania", "Kawalec"));
        persons.add(new Person("Ania", "Kawalec"));
        persons.add(new Person("Szymon", "Zalewski"));
        persons.add(new Person("Jan", "Kowalski"));
        persons.add(new Person("Ania", "Kawalec"));
        persons.add(new Person("Ania", "Kawalec"));
        persons.add(new Person("Szymon", "Zalewski"));

        System.out.println("Persons.size() " + persons.size());
        System.out.println("contains Jan Kowalski? " + persons.contains(new Person("Jan", "Kowalski")));
        persons.remove(new Person("Ania", "Kawalec"));

        System.out.println("Persons.size() " + persons.size());


        for(Person x :persons)
            System.out.println(x.toString());
    }
}