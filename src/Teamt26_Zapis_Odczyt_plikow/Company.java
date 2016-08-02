package Teamt26_Zapis_Odczyt_plikow;

import Teamt26_Zapis_Odczyt_plikow.Serializacja.*;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Sebastian on 2016-04-21.
 */
public class Company implements Serializable {
    public ArrayList<Employee> getPracownicy() {
        return Pracownicy;
    }

    public void setPracownicy(ArrayList<Employee> pracownicy) {
        Pracownicy = pracownicy;
    }

    public  ArrayList<Employee> Pracownicy;
    static String fileName = "Company.obj";
    private static final long serialVersionUID = 3812017177088226528L;


    public Company() {
        Pracownicy = new ArrayList<>();
    }

    public void DODAWANIE(Employee p) {
        Pracownicy.add(p);


    }

    public static void ZAPISYWANIE(Company c) {

        try (
                FileOutputStream fs = new FileOutputStream(fileName);
                ObjectOutputStream os = new ObjectOutputStream(fs);
        ) {
            os.writeObject(c);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Zapisano obiekt do pliku");
    }


    public static Company Wczytywanie() {
        Company company = null;

        try (
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {

            company = (Company) ois.readObject();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return company;
    }


}




