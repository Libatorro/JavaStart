package Teamt24_interface.zadanie;

/**
 * Created by Sebastian on 2016-04-20.
 */
public class BWT {
    public  float PROTEIN;
    public float CARBS;
    public  float FATS;

    public float getPROTEIN() {
        return PROTEIN;
    }

    public void setPROTEIN(float PROTEIN) {
        this.PROTEIN = PROTEIN;
    }

    public float getCARBS() {
        return CARBS;
    }

    public void setCARBS(float CARBS) {
        this.CARBS = CARBS;
    }

    public float getFATS() {
        return FATS;
    }

    public void setFATS(float FATS) {
        this.FATS = FATS;
    }

    public BWT(float PROTEIN, float CARBS, float FATS) {
        this.PROTEIN = PROTEIN;
        this.CARBS = CARBS;
        this.FATS = FATS;
    }
}
