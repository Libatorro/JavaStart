package Teamt26_Zapis_Odczyt_plikow.Serializacja;

import java.io.Serializable;

/**
 * Created by Sebastian on 2016-04-21.
 */
public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private static final long serialVersionUID = 3812017177088226528L;
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Person(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }
}
