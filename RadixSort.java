import java.util.Arrays;

public class RadixSort {

    static int Big(Asset[] Eval, int Extra){

        int Big = Eval[0].getNum();
        for(int i = 1; i < Extra; i++){
            if(Eval[i].getNum() > Big){
                Big = Eval[i].getNum();
            }
        }

        return Big;
    }

    static void SortC(Asset[] NumC, int Place, int P){

        int Begining;
        int c[] = new int[10];
        Asset Exit[] = new Asset[Place];
        Arrays.fill(c, 0);

        for(Begining = 0; Begining < Place; Begining++){
            c[(NumC[Begining].getNum() / P) % 10]++;
        }

        for(Begining = 1; Begining < 10; Begining++){
            c[Begining] += c[Begining-1];
        }

        for(Begining = Place-1; Begining >= 0; Begining--){
            Exit[c[(NumC[Begining].getNum() / P) % 10] - 1] = NumC[Begining];
            c[(NumC[Begining].getNum() / P) % 10]--;
        }

        for(Begining = 0; Begining < Place; Begining++){
            NumC[Begining] = Exit[Begining];
        }

    }

    static String RadixSort(Asset[] number, int E){

        int Temp = Big(number, E);

        for(int a = 1; Temp / a > 0; a *= 10){
            SortC(number, E, a);
        }

        String f = "Los datos se han ordenado: ";
        return f;
    }
}
