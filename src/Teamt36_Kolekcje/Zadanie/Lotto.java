package Teamt36_Kolekcje.Zadanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Sebastian on 2016-04-27.
 */
public class Lotto {

    ArrayList<Integer> lotto;

    public Lotto() {
        lotto = new ArrayList<>();
        
    }
    
    
    public  void Genetere()
    {
        for (int i = 1; i <50 ; i++) {

            lotto.add(new Random().nextInt(49)+1);
        }
        System.out.println(lotto.size());
        
        
    }
    public void randomize()
    {
        Collections.shuffle(lotto);


    }

    public  void checkResult(List<Integer> numbers)
    {
        for (int i = 0; i <6 ; i++) {


        int freq = Collections.frequency(lotto, numbers.get(i));
            System.out.println("liczba "+ numbers.get(i)+" wstepuje w Liscie tyle razy "+freq);
        }

    }

    public  int treafienia(List<Integer> numbers)
    {   int trafienia=0;


        for (int i = 0; i < 6; i++) {
            if(lotto.get(i)==numbers.get(i))
        trafienia++;
        }

return trafienia;
    }
}
