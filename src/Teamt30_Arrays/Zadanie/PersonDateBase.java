package Teamt30_Arrays.Zadanie;

import java.util.Arrays;

/**
 * Created by Sebastian on 2016-04-24.
 */
public class PersonDateBase {
int Number_of_person=1;
Person persons[];
    private int emptyPlace;

    public PersonDateBase() {
        persons = new Person[Number_of_person];
        emptyPlace = 0;
    }

    public void add(Person p)
    {   if(emptyPlace==persons.length) {
        persons= Arrays.copyOf(persons, persons.length * 2);
    }
        persons[emptyPlace]=p;
        emptyPlace++;
    }

    public void remove(Person p) {
        if (p == null)
            return;

        final int NOT_FOUND = -1;
        int found = NOT_FOUND;
        int i = 0;
        while (i < persons.length && found == NOT_FOUND) {
            if (p.equals(persons[i])) {
                found = i;
            } else {
                i++;
            }
        }

        if (found != NOT_FOUND) {
            System.arraycopy(persons, found + 1, persons, found, persons.length - found - 1);
            emptyPlace--;
        }
    }

    public Person get(int index) throws ArrayIndexOutOfBoundsException {
        if (index >= emptyPlace || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Błędny parametr");
        }
        return persons[index];
    }





}
