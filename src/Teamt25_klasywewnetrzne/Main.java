package Teamt25_klasywewnetrzne;

/**
 * Created by Sebastian on 2016-04-20.
 */
public class Main {
    public  static  void main (String args[])
    {

Sortable s = new Sortable() {
    int max=0;
    @Override
    public int[] sort(int[] tab) {
        int temp;
        for (int i = 0; i < tab.length; i++) {
            System.out.println("*");
            for (int j = 1; j < tab.length - i; j++) {
                System.out.println(tab[j-1] + ">" + tab[j] + " " + (tab[j-1] > tab[j]));
                if (tab[j-1] > tab[j]) {
                    temp = tab[j];
                    tab[j] = tab[j-1];
                    tab[j-1] = temp;
                }
            }
        }
        return tab;
    }

    @Override
    public void PRINT(int[] a) {
        for (int x : a)
            System.out.println(x);
    }
};

int [] sorotwnie = {1,342,3,46,234,1236,645,123,45641,12,1,2,5,9,8};


      s.PRINT(  s.sort(sorotwnie));
    }
}
