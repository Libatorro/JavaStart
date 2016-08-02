package Teamt31_Comparable.Zadanie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Random;

/**
 * Created by Sebastian on 2016-04-24.
 */
public class Zadaie  {
    Integer liczbay[];
    int SIZE = 20;

    public Integer[] getLiczbay() {
        return liczbay;
    }

    public Zadaie() {

        liczbay=new Integer[SIZE];

        for (int i = 0; i <SIZE ; i++) {
            liczbay[i]=new Random().nextInt(100);
        }





    }
public static void main(String args[])
{

    Zadaie z = new Zadaie();


    Integer[] numbers={1,2,3,4};
    numbers=z.getLiczbay();

    Arrays.sort(numbers, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return (o1.compareTo(o2));
        }
    });
    System.out.println(
            Arrays.toString(numbers));

}

}
