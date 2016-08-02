package Teamt29_Typy_Generyczne.Zadanie;

/**
 * Created by Sebastian on 2016-04-21.
 */
public class main {

    String imie;
    String nazwisko;
    String wiek;

    @Override
    public String toString() {
        return "main{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek='" + wiek + '\'' +
                '}';
    }

    public main(String imie, String nazwisko, String wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public  static void main(String args[])
    {
     Pair p = new Pair("String",10);
        Pair b = new Pair("Stringasdasd",new main("Grażyna","spierdolina","dupa"));


        p.Wyswietlacz_Tadeuszy();
        b.Wyswietlacz_Tadeuszy();








    }
}
