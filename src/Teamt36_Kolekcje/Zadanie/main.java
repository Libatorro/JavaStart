package Teamt36_Kolekcje.Zadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Sebastian on 2016-04-27.
 */
public class main {
    public static void main(String args[])
    {
        Lotto l = new Lotto();
        l.Genetere();

        List<Integer> testowa= new ArrayList<>();

        for (int i = 0; i <6 ; i++) {
testowa.add(new Random().nextInt(49)+1);
        }




        l.randomize();
        l.checkResult(testowa);
        for (int i = 0; i <10000000; i++) {
            testowa=new main().gene();
           if(l.treafienia(testowa)>4)
            System.out.println(  l.treafienia(testowa));
        }


    }




    public ArrayList<Integer> gene()
    {
        ArrayList<Integer> testowa= new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            testowa.add(new Random().nextInt(49)+1);
        }


return testowa;
    }
}
