package Teamt27_Rekurencja;

/**
 * Created by Sebastian on 2016-04-21.
 */
public class Zadanie {


    public static void main(String args[])
    {


        Zadanie z= new Zadanie();

        System.out.println(     z.silnia(22));







    }




    public int  silnia(int numer)
    {

        if(numer>1)
        {
          return numer*silnia(numer-1);


        }

        else
        {

            return 1;
        }

    }

}
