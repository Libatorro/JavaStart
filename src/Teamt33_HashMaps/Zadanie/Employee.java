package Teamt33_HashMaps.Zadanie;

/**
 * Created by Sebastian on 2016-04-27.
 */
public class Employee {
    String imie;
    String Nazwisko;
    int wyplata;

    public Employee(String imie, String nazwisko) {
        this.imie = imie;
        Nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "imie='" + imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                ", wyplata=" + wyplata +
                '}';
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public int getWyplata() {
        return wyplata;
    }

    public void setWyplata(int wyplata) {
        this.wyplata = wyplata;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (wyplata != employee.wyplata) return false;
        if (imie != null ? !imie.equals(employee.imie) : employee.imie != null) return false;
        return !(Nazwisko != null ? !Nazwisko.equals(employee.Nazwisko) : employee.Nazwisko != null);

    }

    @Override
    public int hashCode() {
        int result = imie != null ? imie.hashCode() : 0;
        result = 31 * result + (Nazwisko != null ? Nazwisko.hashCode() : 0);
        result = 31 * result + wyplata;
        return result;
    }

    public Employee(String imie, String nazwisko, int wyplata) {

        this.imie = imie;
        Nazwisko = nazwisko;
        this.wyplata = wyplata;
    }

    public Employee(String imie) {

        this.imie = imie;
    }
}
