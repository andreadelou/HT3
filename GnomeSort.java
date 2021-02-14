public class gnomesort {

    public static void GnomeSort(Comparable[] list){

        Comparable Comp;
        int x = 1;
        int y = 2;

        while(x < list.length){
            if(list[x - 1].compareTo(list[x]) < 0){
                Comp = list[x - 1];
                list[x - 1] = list[x];
                list[x--] = Comp;
                x = (x==0) ? y++ : x;
            } else {
                x = y;
                y++;
            }
        }
    }
}
