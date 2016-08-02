package Teamt24_interface.zadanie;

import java.util.ArrayList;

/**
 * Created by Sebastian on 2016-04-20.
 */
public class Mieso implements Produkty {


    public BWT MIKROSKLADNIKI;

    public  String nazwa;

    ArrayList<String> Maching;

    public Mieso(BWT MIKROSKLADNIKI, String nazwa, ArrayList<String> maching) {
        this.MIKROSKLADNIKI = MIKROSKLADNIKI;
        this.nazwa = nazwa;
        Maching = maching;
    }

    public BWT getMIKROSKLADNIKI() {
        return MIKROSKLADNIKI;
    }

    public void setMIKROSKLADNIKI(BWT MIKROSKLADNIKI) {
        this.MIKROSKLADNIKI = MIKROSKLADNIKI;
    }




    @Override
    public ArrayList<String> Maching_product() {




        return Maching;

    }

    @Override
    public float kalorycznosc(BWT s) {
      return MIKROSKLADNIKI.FATS*8+MIKROSKLADNIKI.PROTEIN*4+MIKROSKLADNIKI.CARBS*4;

    }
}
