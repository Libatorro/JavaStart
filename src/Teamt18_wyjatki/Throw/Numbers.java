package Teamt18_wyjatki.Throw;

/**
 * Created by Sebastian on 2016-04-16.
 */
public class Numbers {
    private int[] numbers;

    public Numbers() {
        numbers = new int[10];
    }

    public void add(int index, int number) throws ArrayIndexOutOfBoundsException {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("Indeks musi być większy od 0!");
        } else if (index >= numbers.length) {
            throw new ArrayIndexOutOfBoundsException(
                    "Indeks musi być mniejszy od rozmiaru tablicy: " + numbers.length + " bo bedziesz bity i ponizany lamusie ");
        }
        numbers[index] = number;
    }

    public int get(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= numbers.length) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return numbers[index];
    }
}
