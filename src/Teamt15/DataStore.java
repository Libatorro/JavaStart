package Teamt15;

import java.util.ArrayList;

/**
 * Created by Sebastian on 2016-04-15.
 */
public class DataStore {
    ArrayList<Computer> lista;


    public DataStore() {
        lista = new ArrayList<>();
    }

    public void add(Computer pawel) {
        if(lista.size()>Computer.limit) {
            System.out.println("limit komputerow");
            return;
        }
        lista.add(pawel);


    }

    public void checkAvalability() {

        System.out.println("Lista wszystkich komputerow");
        for (Computer x : lista)
            System.out.println(x.toString());

        for (int j = 0; j < lista.size(); j++) {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).equals(lista.get(j))) {

                    System.out.println(lista.get(i).toString());

                }
            }


        }


    }
}
