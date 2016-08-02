package Teamt39_Stream;

/**
 * Created by Sebastian on 2016-05-05.
 */
public class DataPoint {
    int dzien;
    int data;
    int rok;

    double wartosc;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DataPoint{");
        sb.append("dzien=").append(dzien);
        sb.append(", data=").append(data);
        sb.append(", rok=").append(rok);
        sb.append(", wartosc=").append(wartosc);
        sb.append('}');
        return sb.toString();
    }

    public int getDzien() {
        return dzien;
    }

    public void setDzien(int dzien) {
        this.dzien = dzien;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }

    public DataPoint(int dzien, int data, int rok, double wartosc) {

        this.dzien = dzien;
        this.data = data;
        this.rok = rok;
        this.wartosc = wartosc;
    }
}
