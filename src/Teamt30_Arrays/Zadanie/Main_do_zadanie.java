package Teamt30_Arrays.Zadanie;

/**
 * Created by Sebastian on 2016-04-24.
 */
public class Main_do_zadanie {
    public  static void main(String args[])
    {

        PersonDateBase pb= new PersonDateBase();



        Person p = new Person("janusz","steram","123");
        Person b =new Person("janusz","steram","1223");
        pb.add(new Person("janusz","steram","12223"));
        pb.add(new Person("janusz","steram","12223"));

        pb.add(new Person("janusz","steram","12223"));

        pb.add(new Person("janusz","steram","12223"));

        pb.add(new Person("janusz","steram","12223"));


        System.out.println(p.equals(b));



       pb.remove(new Person("janusz","steram","123"));

    }
}
