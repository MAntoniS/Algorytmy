package Day1;

public class SelectionSort {

    public static void sort(int[] tab)
    {
        for (int i = 0; i < tab.length; i++ )
        {
            for (int j = i + 1; j < tab.length; j ++)
            {
                if(tab[i] > tab[j])swap(tab,i,j);
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
