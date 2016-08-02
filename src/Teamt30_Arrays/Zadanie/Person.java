package Teamt30_Arrays.Zadanie;

/**
 * Created by Sebastian on 2016-04-24.
 */
public class Person {
public  String imie;
    public  String nazwisko;
    public  String PESEL;

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", PESEL='" + PESEL + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (imie != null ? !imie.equals(person.imie) : person.imie != null) return false;
        if (nazwisko != null ? !nazwisko.equals(person.nazwisko) : person.nazwisko != null) return false;
        return !(PESEL != null ? !PESEL.equals(person.PESEL) : person.PESEL != null);

    }

    @Override
    public int hashCode() {
        int result = imie != null ? imie.hashCode() : 0;
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        result = 31 * result + (PESEL != null ? PESEL.hashCode() : 0);
        return result;
    }

    public Person(String imie, String nazwisko, String PESEL) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.PESEL = PESEL;
    }
}
