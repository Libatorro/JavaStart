package Teamt18_wyjatki.Throw;

/**
 * Created by Sebastian on 2016-04-16.
 */
public class TestNumber {
    public static void main(String[] args) {
        Numbers nums = new Numbers();
        try {
            // wszystko ok
            nums.add(3, 5);
            // błędy indeks, wygenerowanie wyjątku
            nums.add(20, 20);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
