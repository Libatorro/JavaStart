package Teamt26_Zapis_Odczyt_plikow;

import Teamt26_Zapis_Odczyt_plikow.Serializacja.*;

/**
 * Created by Sebastian on 2016-04-21.
 */
public class Employee extends Teamt26_Zapis_Odczyt_plikow.Serializacja.Person {
    private float wypłata;


    public Employee(String firstName, String lastName, float wypłata) {
        super(firstName, lastName);
        this.wypłata = wypłata;
    }



    public float getWypłata() {
        return wypłata;
    }

    public void setWypłata(float wypłata) {
        this.wypłata = wypłata;
    }

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);

    }

    @Override
    public String toString() {
        return "Employee{" +
                "wypłata=" + wypłata +this.getFirstName()+"  "+getLastName()+
                '}';
    }
}
