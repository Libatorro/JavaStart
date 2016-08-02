package Teamt29_Typy_Generyczne.Zadanie;

/**
 * Created by Sebastian on 2016-04-21.
 */
public class Pair<T,V> {
    private  T Janusz;
    private V Valderam;

    public Pair(T janusz, V tadeusz) {
        Janusz = janusz;
        Valderam = tadeusz;
    }

    public T getJanusz() {

        return Janusz;
    }

    public void setJanusz(T janusz) {
        Janusz = janusz;
    }

    public V getTadeusz() {
        return Valderam;
    }

    public void setTadeusz(V tadeusz) {
        Valderam = tadeusz;
    }

public void Wyswietlacz_Tadeuszy()
{

    System.out.println("to jest tadeusz "+getJanusz());
    System.out.println("to jest Wlademar "+getTadeusz());

}


}
