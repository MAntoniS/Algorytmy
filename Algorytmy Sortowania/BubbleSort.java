package Day1;

public class BubbleSort {

    public static void sort( int[] tab)
    {
        int x = 0;
        for (int i = tab.length -1; i >0; i --)
        {
            if (tab[i] < tab[i - 1])
            {
                swap(tab,i, i -1);
                x++;
            }
        }
        if (x > 0) sort(tab);
    }

    private static void swap(int[] tab, int i, int j)
    {
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }
}
