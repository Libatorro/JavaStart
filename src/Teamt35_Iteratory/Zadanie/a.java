package Teamt35_Iteratory.Zadanie;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Sebastian on 2016-04-27.
 */
public class a {

    String imie;
    String nazwisko;
    int wiek;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        a a = (a) o;

        if (wiek != a.wiek) return false;
        if (imie != null ? !imie.equals(a.imie) : a.imie != null) return false;
        return !(nazwisko != null ? !nazwisko.equals(a.nazwisko) : a.nazwisko != null);

    }

    @Override
    public int hashCode() {
        int result = imie != null ? imie.hashCode() : 0;
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        result = 31 * result + wiek;
        return result;
    }

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

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public a(String imie, String nazwisko, int wiek) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("a{");
        sb.append("imie='").append(imie).append('\'');
        sb.append(", nazwisko='").append(nazwisko).append('\'');
        sb.append(", wiek=").append(wiek);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String args[]) {
        TreeMap<String, a> DrzewoMAPA = new TreeMap<String, a>();
        DrzewoMAPA.put("aNowak", new a("Piotr", "nowak", 87));
        DrzewoMAPA.put("aNowak", new a("Piotr", "nowak", 87));
        DrzewoMAPA.put("zNowak", new a("Piotr", "zNowak", 87));
        DrzewoMAPA.put("Nowak", new a("Piotr", "nowak", 87));
        DrzewoMAPA.put("fNowak", new a("Piotr", "fNowak", 87));
        DrzewoMAPA.put("zNowak", new a("Piotr", "zNowak", 87));

        DrzewoMAPA.put("hNowak", new a("Piotr", "hNowak", 87));

        Iterator<a> Iteratora = DrzewoMAPA.values().iterator();

        while (Iteratora.hasNext())
            System.out.println(Iteratora.next());


        Map<String, String> names = new TreeMap<>();

        names.put("Kowalski", "Jan Kowalski - 35");
        names.put("Adamiak", "Ania Adamiak - 21");
        names.put("Zaręba", "Adam Zaręba - 17");
        names.put("Piotrowski", "Karol Piotrowski - 42");
        names.put("Bobrowska", "Michalina Bobrowska - 15");

        Iterator<String> valuesIterator = names.values().iterator();
        while (valuesIterator.hasNext()) {
            System.out.println(valuesIterator.next());

        }


    }
}

