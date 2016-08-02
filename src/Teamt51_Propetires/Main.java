package Teamt51_Propetires;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.util.Scanner;

/**
 * Created by Sebastian on 2016-05-16.
 */
public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        IntegerProperty first = new SimpleIntegerProperty();
        IntegerProperty second = new SimpleIntegerProperty();
        IntegerProperty second2 = new SimpleIntegerProperty();
        second.bind(first);
        second2.bind(second);

        System.out.println("Pierwsza liczba: ");
        first.set(sc.nextInt());
        sc.nextLine();
        System.out.println("Zmiana w second: " + second.get());

        System.out.println("Druga liczba: ");
        first.set(sc.nextInt());
        sc.nextLine();
        System.out.println("Zmiana w second: " + second.get());
        System.out.println(second2.get()+" ddd");

        sc.close();


    }
}
