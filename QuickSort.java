/*
Andrea Lam, 20102
Fecha de creación: 6/02/21
Modificación 1: 8/02/21

Referencias:
https://www.w3schools.com/java/java_date.asp
 */

import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class QuickSort {

    Random r = new Random();

    int[] vector;

    public void QuickSort()
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
        /*
         nc = 0; ni = 0;
            v2 = new int[n];

            for (int x = 0; x < n; x++)
            {
                v2[x] = v1[x];
            }
            ti = DateTime.Now;
            QS(v2,n);
            tf = DateTime.Now;

            for (int i = 0; i < n; i++)
            {
                textBox7.Text += v2[i] + Environment.NewLine;
            }
            textBox5.Text = "Comparaciones: " + nc.ToString() + Environment.NewLine +
              "Intercambios: " + ni.ToString() + Environment.NewLine + "Tiempo que tardo:" + (tf - ti).ToString();
         */
        int nc=0; int ni=0;
        int[] v2=new int[3000];

        for (int x = 0; x < 3000; x++)
        {
            v2[x]=vector[x];
        }

        //para ver cuanto tiempo "actual" le tomo ordenar
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

    }

}
