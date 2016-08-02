package Teamt26_Zapis_Odczyt_plikow;

import java.io.Serializable;

/**
 * Created by Sebastian on 2016-04-21.
 */
public class Person implements Serializable{
    private String firstName;
    private String secondName;

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
