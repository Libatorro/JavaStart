package Teamt15;

/**
 * Created by Sebastian on 2016-04-15.
 */
public class Computer {
    String producent;
    int model;
    static int limit=100;

    public Computer(String producent, int model) {
        this.producent = producent;


     if(model>1&&model<1000000)
        this.model = model;
        else
         this.model=0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Computer computer = (Computer) o;

        if (model != computer.model) return false;
        return !(producent != null ? !producent.equals(computer.producent) : computer.producent != null);

    }

    @Override
    public int hashCode() {
        int result = producent != null ? producent.hashCode() : 0;
        result = 31 * result + model;
        return result;
    }

    @Override
    public String toString() {
        return "Computer " +
                " producent " + producent  +
                "  model " + model
            ;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
