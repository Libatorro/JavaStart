package Teamt29_Typy_Generyczne;

/**
 * Created by Sebastian on 2016-04-21.
 */
public class GenericMethods {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.print5Times(2);
        gm.print5Times("Krzysio");
    }

    public <T> void print5Times(T arg) {
        for(int i=0; i<5; i++)
            System.out.println(arg);
    }
}