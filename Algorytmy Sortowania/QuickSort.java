package Day1;

public class QuickSort {

    public static void sort(int tablica[], int x, int y)  {

        int i, j, v;

        i = x;
        j = y;
        v = tablica[(x + y) / 2];
        do {
            while (tablica[i] < v)
                i++;
            while (v < tablica[j])
                j--;
            if (i <= j) {
                swap(tablica, i,j);
                i++;
                j--;
            }
        }
        while (i <= j);
        if (x < j)
            sort(tablica, x, j) ;
        if (i < y)
            sort(tablica, i, y) ;
    }
    private static void swap(int[] tab, int i, int j)
    {
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }
}
