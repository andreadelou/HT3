/*
Andrea Lam, 20102
Fecha de creación: 6/02/21
Modificación 1: 8/02/21
Modificación 2: 9/02/21

 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class InsertSort {

    Random r = new Random();

    int[] v1;
    int[] v2;

    public void InsertSort()
    {
        //ingresar los números random en el vector
        v1 = new int[3000];
        for (int i=0; i<3000; i++)
        {
            v1[i]=r.nextInt(3000);
        }
    }

    public void ordenar()
    {
        v2=new int[3000];

        for (int x = 0; x < 3000; x++)
        {
            v2[x]=v1[x];
        }

        //para ver cuanto tiempo "actual" le tomo ordenar
        LocalDateTime tiempo = LocalDateTime.now();
        LocalDateTime tiempot = tiempo;
        System.out.println("Tiempo inicial: " + tiempo);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        Insert(v2,3000);

        String formattedDate = tiempo.format(myFormatObj);
        System.out.println("Tiempo final: " + formattedDate);
        //System.out.println("Tiempo total: " + (tiempo-tiempot) );

        for (int i = 0; i < 3000; i++)
        {
            System.out.println( v2[i]);
        }
    }

    private void Insert(int[] L, int n)
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
