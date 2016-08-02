package Teamt34_Kolejki.Zadanie;

import Teamt16.Pizza;

/**
 * Created by Sebastian on 2016-04-27.
 */
public class Task {

    String nazwa_zadania;
    String description;
    Priority p;

    @Override
    public String toString() {
        return "Task " +
                "nazwa_zadania= '" + nazwa_zadania + '\'' +
                ", description= '" + description + '\'' +
                ", p= " + p
                ;
    }

    public Task(String nazwa_zadania, String description, Priority p) {

        this.nazwa_zadania = nazwa_zadania;
        this.description = description;
        this.p = p;
    }
    /*
Napisz program, który będzie pozwalał stworzyć prostą listę To-Do (rzeczy do zrobienia) z możliwością określania priorytetów.

Do reprezentacji pojedynczych zadań utwórz klasę Task, w której będą pola name (nazwa zadania), description (opcjonalny opis zadania) oraz priority (priorytet)
w postaci wartości Enum przyjmującej wartość LOW, MODERATE lub HIGH.

W klasie TaskManager dodaj prostą logikę aplikacji, pozwalającą wykonać trzy czynności:

dodać nowe zadanie
pobrać kolejne zadanie o najwyższym priorytecie do zrobienia
wyjść z aplikacji
Kwestię obsługi wyjątków i nietypowych sytuacji możesz uprościć do minimum.

 */



    public enum Priority
    {   HIGHT, MODERATE,LOW;
    }
}
