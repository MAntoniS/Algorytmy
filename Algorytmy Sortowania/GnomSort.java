package Day1;

public class GnomSort {

    public static void sort(int[] tab)
    {
        for(int i = 0; i < tab.length; i++)
        {
            while(i > 0 && tab[i] < tab[i-1])
            {
                   swap(tab,i, i -1);
                   i--;
            }

        }

    }

    private static void swap(int[] tab, int i, int j)
    {
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }
}
