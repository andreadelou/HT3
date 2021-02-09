/*
Andrea Lam, 20102
Fecha de creación: 6/02/21
Modificación 1: 8/02/21
Modificación 2: 9/02/21

 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class MergeSort {

    Random r = new Random();

    int[] vector;
    int p1, p2;
    int[] v1;
    int[] v2;
    int[] v3;

    public void MergeSort()
    {
        //ingresar los números random en el vector
            vector = new int[3000];
        for (int i=0; i<3000; i++)
        {
            vector[i]=r.nextInt(3000);
        }
    }

    private void ordenar()
    {
        int[] v2=new int[3000];

        for (int x = 0; x < 3000; x++)
        {
            v2[x]=vector[x];
        }

        //para ver cuanto tiempo "actual" le tomo ordenar
        LocalDateTime tiempo = LocalDateTime.now();
        LocalDateTime tiempot = tiempo;
        System.out.println("Tiempo inicial: " + tiempo);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        Merge(v2,3000);

        String formattedDate = tiempo.format(myFormatObj);
        System.out.println("Tiempo final: " + formattedDate);
        //System.out.println("Tiempo total: " + (tiempo-tiempot) );

        for (int i = 0; i < 3000; i++)
        {
            System.out.println( v2[i]);
        }
    }

    private void Merge(int[] L, int n)
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

        do
        {
            if (v1[c1] <= v2[c2])
            {
                c1 = c1 + 1;
                c3 = c3 + 1;
            }

            else if (v1[c1] >= v2[c2])
            {
                c2 = c2 + 1;
                c3 = c3 + 1;

            }
        }
        while (c3 < y);
    }
}
