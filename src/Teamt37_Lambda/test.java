package Teamt37_Lambda;

import java.util.function.Function;

/**
 * Created by Sebastian on 2016-05-05.
 */
public class test {
    public static  void main (String args[])
    {
        //funkcja przyjmuje String i zwraca String
        Function<String, String> func = (String str) -> str.toLowerCase().trim();
        String original = "   WIELKI NAPIS   ";


        Function<String, String> func1 = (String str) -> str.concat("IE");

        //wywołujemy funkcję przekazując jej original jako argument
        String lowerCaseTrim = func.apply(original);
        System.out.println(lowerCaseTrim);

        System.out.println(func1.apply(original));



    }
}
