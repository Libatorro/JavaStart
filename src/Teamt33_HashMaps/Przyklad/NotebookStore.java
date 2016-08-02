package Teamt33_HashMaps.Przyklad;

/**
 * Created by Sebastian on 2016-04-27.
 */
import java.util.HashMap;
import java.util.Map;

public class NotebookStore {
    public static void main(String[] args) {
        Map<String, Notebook> notebooks = new HashMap<>();
        notebooks.put("B590", new Notebook("Lenovo", "B590"));
        notebooks.put("Inspiron0211A", new Notebook("Dell", "Inspiron0211A"));
        notebooks.put("G2A33EA", new Notebook("HP", "G2A33EA"));
        notebooks.put("XPS0091V", new Notebook("Dell", "XPS0091V"));
        notebooks.put("DUPA", new Notebook("Delaal", "XPS009asdasdasdasdchuj chuj chuj jjj1V"));



        //wyświetlamy zbiór kluczy
        System.out.println("Modele laptopów: ");
        for(String key: notebooks.keySet()) {
            System.out.println(key);
        }

        //wyświetlamy informację o laptopach na podstawie kluczy
        String key = "DUPA";
        System.out.println("Znaleziono laptop o kodzie G2A33EA: ");
        System.out.println(notebooks.get(key));

        //usuwamy obiekt na podstawie klucza
        notebooks.remove("XPS0091V");

        System.out.println("Ilość produktów w sklepie: " + notebooks.size());
    }
}
