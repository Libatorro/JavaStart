package Teamt33_HashMaps.Zadanie;

import java.util.TreeMap;

/**
 * Created by Sebastian on 2016-04-27.
 */
public class Company {

public static void main(String args[])
{

    Company company = new Company();

    company.Dodawanie(new Employee("Janusz","Sram",800));
    company.Dodawanie(new Employee("Pawel","Sram",1800));
    company.Dodawanie(new Employee("Rafał ","Pokulachsiedrapał",800));
    company.Dodawanie(new Employee("Zbigniwem","ram",2800));
    company.Dodawanie(new Employee("Tadeusz","asdad",800));


    System.out.println(company.Wszukiwanie("Pawel","Sam").toString());
}




    TreeMap<String,Employee> Mapa;

    public Company() {
        Mapa = new TreeMap<>();
    }

    public void Dodawanie(Employee employee)
    {
Mapa.put(employee.imie+" "+employee.Nazwisko,employee);

    }

public Employee Wszukiwanie(String imie,String nazwiko)
{
Employee tmp=null;

    String key=imie+" "+nazwiko;


if( Mapa.get(key)!=null)
    return   Mapa.get(key);

    else
    return new Employee("brak","brak",0);

}



}
