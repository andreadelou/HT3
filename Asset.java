public class Asset implements Comparable<Asset> {

    private Integer Num;

    public Asset(Integer F){
        Num = F;
    }

    public Integer getNum(){
        return Num;
    }

    @Override
    public int compareTo(Asset number) {
        Integer Extra = number.getNum();
        Integer Res;

        Res = Extra.compareTo(Num);

        return Res;
    }

    public String toString(){
        return String.valueOf(Num);
    }
}
