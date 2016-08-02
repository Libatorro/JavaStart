package Teamt26_Zapis_Odczyt_plikow;

/**
 * Created by Sebastian on 2016-04-21.
 */
public class Main {

    public static void main (String args[])
    {
      Company Kompany_jebany = new Company();
        Kompany_jebany.DODAWANIE(new Employee("janusz","tracz"));
        Kompany_jebany.DODAWANIE(new Employee("janusz","pracz"));
        Kompany_jebany.DODAWANIE(new Employee("janusz","pracz",1000));

        Kompany_jebany.DODAWANIE(new Employee("Tadeusz","sracz"));

        Kompany_jebany.DODAWANIE(new Employee("Tadeusz","sracz",12310));



        Company.ZAPISYWANIE(Kompany_jebany);


        Company srany = Company.Wczytywanie();


        for(Employee x:srany.Pracownicy )
        {
            System.out.println(   x.toString());
        }




    }
}
