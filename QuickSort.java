/*
Sort de QuickSort
Fecha de creación: 6/02/21
Modificación 1: 8/02/21

 */

import java.util.Random;

public class QuickSort {

    Random r = new Random();

    int[] v2;
    int nc=0; int ni=0;

    public void ordenar()
    {
        v2=new int[3000];

        for (int x = 0; x < 3000; x++)
        {
            v2[x]=r.nextInt(3000);
        }

        QS(v2,3000);

        for (int i = 0; i < 3000; i++)
        {
            System.out.println( v2[i]);
        }
    }

    private void QS(int[] L, int t)
    {
        if (t > 1)
        {

            int[] l1 = new int[t - 1];
            int[] l2 = new int[t - 1];
            int i, t1, t2;
            int e;
            e = L[0];
            t1 = 0; t2 = 0;
            for (i = 1; i < t; i++)
            {
                if (L[i] < e)
                {
                    l1[t1++] = L[i];
                    ni++;
                }

                else
                {
                    l2[t2++] = L[i];
                    ni++;
                }

            }
            QS(l1, t1);
            QS(l2, t2);
            for (i = 0; i < t1; i++) L[i] = l1[i];
            L[t1] = e;
            for (i = 0; i < t2; i++) L[t1 + 1 + i] = l2[i];
            nc++;
        }

    }

}
