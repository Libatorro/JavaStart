package Teamt15;

/**
 * Created by Sebastian on 2016-04-15.
 */
public class NotebookShop {

    public static void main(String [] args)
    {

        DataStore dt = new DataStore();

        dt.add(new Computer("zssr",12314));
        dt.add(new Computer("zssr",12314));

        dt.add(new Computer("ukranin ",11214));
        dt.add(new Computer("HP",1123));


        dt.add(new Computer("LG",1112323));
        dt.add(new Computer("DELL",1123));


dt.checkAvalability();




    }
}
