/*
Sort Merge
Fecha de creación: 6/02/21
Modificación 1: 8/02/21
Modificación 2: 9/02/21

 */
import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    Random r = new Random();

    int p1, p2;
    int[] v1;
    int[] v2;
    int[] v3;

    public void ordenar()
    {
        //ingresar los números random en el vector
            v1 = new int[1500];
        for (int i=0; i<1500; i++)
        {
            v1[i]=r.nextInt(1500);
        }
        Arrays.sort(v1);


        v2 = new int[1500];
        for (int i=0; i<1500; i++)
        {
            v2[i]=r.nextInt(1500);
        }
        Arrays.sort(v2);

        Merge(v1,v2);

        for (int i=0; i<1500; i++)
        {
            System.out.println(v3[i]);
        }

    }

    private void Merge(int[] v1, int[]v2)
    {
        int c1, c2, c3;
        c1 = 0;
        c2 = 0;
        c3 = 0;
        int y = v1.length - 1 + v2.length - 1;

        v1[p1] = (v2[p2 - 1])+1 ;

        v2[p2] = (v1[p1 - 1])+1 ;

        // v1[p1] = (v1[p1]) + 1;
        //v2[p2] = (v2[p2]) + 2;
        v3 = new int[3000];

        do
        {
            if (v1[c1] <= v2[c2])
            {
                v3[c1] = v1[c1];
                c1 = c1 + 1;
                c3 = c3 + 1;
            }

            else if (v1[c1] >= v2[c2])
            {
                v3[c2]= v2[c2];
                c2 = c2 + 1;
                c3 = c3 + 1;

            }
        }
        while (c3 < y);
    }
}
