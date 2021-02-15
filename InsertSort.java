/*
Sort de Incersion
Fecha de creación: 6/02/21
Modificación 1: 8/02/21
Modificación 2: 9/02/21

 */

import java.util.Random;

public class InsertSort {

    Random r = new Random();

    int[] v1;
    int[] v2;

    public void ordenar()
    {
        v1=new int[3000];
        v2=new int[3000];

        for (int x = 0; x < 3000; x++)
        {
            v2[x]=r.nextInt(3000);
            v1[x]=r.nextInt(3000);
        }

        Insert(v1,v2,3000);

        for (int i = 0; i < 3000; i++)
        {
            System.out.println( v2[i]);
        }
    }

    private void Insert(int[] v1,int[] v2 , int n)
    {
        int j,t,ni,nc;
        nc = 0;ni = 0;

        for (int i = 0; i < n; i++)
        {
            int pos = 0;
            for (j = 0; j < n; j++)
            {
                nc++;
                if (v1[j] < v1[i])
                {
                    pos++;
                }
                ni++;
            }
            v2[pos] = v1[i];
        }
    }

}
