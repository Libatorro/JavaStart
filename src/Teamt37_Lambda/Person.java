package Teamt37_Lambda;

/**
 * Created by Sebastian on 2016-05-05.
 */
public class Person {
String imie;
    String nazwisko;
    int Age;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("imie='").append(imie).append('\'');
        sb.append(", nazwisko='").append(nazwisko).append('\'');
        sb.append(", Age=").append(Age);
        sb.append('}');
        return sb.toString();
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Person(String imie, String nazwisko, int wiek) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.Age = wiek;
    }
}
