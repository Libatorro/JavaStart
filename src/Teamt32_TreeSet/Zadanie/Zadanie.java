package Teamt32_TreeSet.Zadanie;

import Teamt26_Zapis_Odczyt_plikow.Serializacja.Person;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Sebastian on 2016-04-27.
 */
public class Zadanie {

    public static void main(String arg[])
    {

        TreeSet<String> NAMES=Wczytawanie();

        System.out.println(NAMES.size());
        System.out.println(NAMES.first());

    }



    public static TreeSet<String> Wczytawanie() {
        TreeSet<String> NAMES= new TreeSet<>(new Comparator_Opierdalator());
        String fileName = "namespl.txt";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String tmp = null;
            while ((tmp = reader.readLine()) != null) {
           NAMES.add(tmp);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    return NAMES;
    }

    private static class Comparator_Opierdalator implements Comparator<String> {



        @Override
        public int compare(String o1, String o2) {
            return -o1.compareTo(o2);
        }
    }

}
