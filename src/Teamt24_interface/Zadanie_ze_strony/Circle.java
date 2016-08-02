package Teamt24_interface.Zadanie_ze_strony;

/**
 * Created by Sebastian on 2016-04-20.
 */
public class Circle implements Shape {

    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(double r) {
        setR(r);
    }

    @Override
    public double calculateArea() {
        return Shape.PI * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Shape.PI * r;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Koło, ");
        sb.append("promień: " + r + ", ");
        sb.append("pole: " + calculateArea() + ", ");
        sb.append("obwód: " + calculatePerimeter());
        return sb.toString();
    }
}