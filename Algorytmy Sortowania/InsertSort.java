package Day1;

public class InsertSort {

    public static void sort(int[] tab)
    {
        int i,j,v;

        for (i=1;i< tab.length;i++) {
            j=i;
            v=tab[i];
            while ((j>0) && (tab[j-1]>v)) {
                tab[j]=tab[j-1];
                j--;
            }
            tab[j]=v;
        }
    }
}
