/*

Clase principal para poder mandar a llamar a los sorts

Fecha de creación: 6/02/21
Modificación 1: 8/02/21
Modificación 2: 9/02/21
Modificación 3: 14/02/21

 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) { //creando el metodo main

        //creando atributos
        int op=0;
        Asset[] lista=new Asset[3000];

        Scanner scan = new Scanner(System.in);

        //mostrando mensaje de inicio
        System.out.println("\n\nBienvenido a los Sorts");

        while(op!=6) // el menu se seguira mostrando mientras no elija salir
        {

            System.out.println("\nPorfavor elija una de las siguientes opciones:");

            //mostrando las opciones
            System.out.println("\n1. Gnome Sort");
            System.out.println("2. Merge Sort");
            System.out.println("3. Quick Sort");
            System.out.println("4. Radix Sort");
            System.out.println("5. Insert Sort");
            System.out.println("6. Salir");


            //while para asegurar que el usuario solo ingrese numeros y caracteres validos
            while(true){
                try{
                    System.out.print("Opcion: ");
                    op = scan.nextInt();
                    System.out.println("\n");
                    //(Programación defensiva)
                    //Protección por si el usuario elige un número menor a uno o mayor a dos, seguirá pidiendo la opción.
                    if(op > 6 || op < 1){
                        System.out.println("Opcion incorrecta, intenta de nuevo..");
                    }
                    //Si el usuario ingresa los datos correctos terminará el ciclo while
                    else{break;}
                }
                //Si el usuario ingresa una letra regresará un mensaje de error.
                catch(Exception o){
                    scan.nextLine();
                    System.out.println("Caracter invalido! Intenta de nuevo..");
                }
            }

            switch(op) {
                case 1:
                        GnomeSort GS =  new GnomeSort();
                    break;
                case 2:
                        MergeSort MS = new MergeSort();
                        MS.ordenar();

                    break;
                case 3:
                        QuickSort QS = new QuickSort();
                        QS.ordenar();

                    break;
                case 4:
                        RadixSort RS = new RadixSort();
                        RadixSort.RadixSort(lista,lista.length);

                    break;
                case 5:
                        InsertSort IS = new InsertSort();
                        IS.ordenar();

                    break;
                case 6:
                    System.out.println("Pase feliz día");
                    break;
                default:
                    // code block
            }




        }

        scan.close();

    }

}
